package com.nttdata.bootcamp.productservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.bootcamp.productservice.dto.Product;
import com.nttdata.bootcamp.productservice.services.ProductoServiceI;

@RestController
public class ProductoController {

    @Value("${product.product-name}")
    private String get;

    @GetMapping(path="/producto")
    public String miProducto(){
        return get;
    }

    @Autowired
    private ProductoServiceI productService;

    @GetMapping("/{id}")
    public Product getProduct(@PathVariable Integer id) {
        return productService.getProduct(id);
    }

}
