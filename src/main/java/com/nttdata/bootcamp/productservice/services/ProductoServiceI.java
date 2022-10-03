package com.nttdata.bootcamp.productservice.services;

import com.nttdata.bootcamp.productservice.dto.Product;

public interface ProductoServiceI {
    
    Product getProduct(Integer id);

    Product postProduct(Product product);

}
