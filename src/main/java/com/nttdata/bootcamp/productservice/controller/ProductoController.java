package com.nttdata.bootcamp.productservice.controller;

import org.springframework.web.bind.annotation.RestController;

import com.nttdata.bootcamp.productservice.services.Product;

@RestController
public interface ProductoController {


    public Product getProduct(){
        Product producto = new Product();
        product.setProductId();
        product.setChannel();
        return product;
    }
    

}
