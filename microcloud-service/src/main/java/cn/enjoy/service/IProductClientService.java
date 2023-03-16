package cn.enjoy.service;

import cn.enjoy.feign.FeignClientConfig;
import cn.enjoy.vo.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(name = "microcloud-provider-product",configuration = FeignClientConfig.class)
public interface IProductClientService {
    @RequestMapping("/product/get/{id}")
    Product getProduct(@PathVariable("id")long id);

    @RequestMapping("/product/list")
    List<Product> listProduct();

    @RequestMapping("/product/add")
    boolean addProduct(Product product);
}
