package cn.enjoy.service.impl;

import cn.enjoy.mapper.ProductMapper;
import cn.enjoy.service.IProductService;
import cn.enjoy.vo.Product;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @description:
 * @author: ZJW
 * @time: 2023/3/13 23:02
 */
@Service
public class ProductServiceImpl implements IProductService {
    @Resource
    private ProductMapper productMapper;
    @Override
    public Product get(long Id) {
        return productMapper.findById(Id);
    }

    @Override
    public boolean add(Product product) {
        return productMapper.create(product);
    }

    @Override
    public List<Product> list() {
        return productMapper.findAll();
    }
}
