package com.nttdata.bootcamp.productservice.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.nttdata.bootcamp.productservice.dto.Product;

@Service
public class ProductoServiceImpl implements ProductoServiceI {
    Map<Integer, Product> products = new HashMap<>();

    @Override
    public Product getProduct(Integer id) {
        return products.get(id);
    }

    @Override
    public Product postProduct(Product product) {
        Integer i = 1;
        while(products.containsKey(i)) {
            i = i + 1;
        }
        product.setProductId(i);
        products.put(i, product);
        return product;
    }

}
