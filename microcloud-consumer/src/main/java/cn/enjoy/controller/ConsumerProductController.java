package cn.enjoy.controller;

import cn.enjoy.vo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

/**
 * @description:
 * @author: ZJW
 * @time: 2023/3/14 23:22
 */
@RestController
@RequestMapping("/consumer")
public class ConsumerProductController {
    public static final String PRODUCT_GET_URL = "http://localhost:8080/product/get/";
    public static final String PRODUCT_LIST_URL = "http://localhost:8080/product/list/";
    public static final String PRODUCT_ADD_URL = "http://localhost:8080/product/add/";

    @Resource
    private RestTemplate restTemplate;

    @Resource
    private HttpHeaders httpHeaders;

    @RequestMapping("/product/get")
    public Object getProduct(long id){
        //Product product = restTemplate.getForObject(PRODUCT_GET_URL + id, Product.class);
        Product product = restTemplate.exchange(PRODUCT_GET_URL + id, HttpMethod.GET,
                new HttpEntity<>(httpHeaders),Product.class).getBody();
        return product;
    }
    @RequestMapping("/product/list")
    public Object listProduct(){
       // List<Product> product = restTemplate.getForObject(PRODUCT_LIST_URL, List.class);
        List<Product> product = restTemplate.exchange(PRODUCT_LIST_URL,HttpMethod.GET,
                new HttpEntity<>(httpHeaders),List.class).getBody();
        return product;
    }
    @RequestMapping("/product/add")
    public Object addProduct(Product product){
       // Boolean result = restTemplate.postForObject(PRODUCT_ADD_URL, product, Boolean.class);
        Boolean result = restTemplate.exchange(PRODUCT_ADD_URL, HttpMethod.POST, new HttpEntity<>(httpHeaders), Boolean.class).getBody();
        return result;
    }
}
