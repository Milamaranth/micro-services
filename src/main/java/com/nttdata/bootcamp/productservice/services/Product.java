package com.nttdata.bootcamp.productservice.services;

import org.springframework.stereotype.Service;

@Service
public class Product {

    private Integer productId;
    private String channel;


    public Integer getProductId() {
        return productId;
    }
    public void setProductId(Integer productId) {
        this.productId = productId;
    }
    public String getChannel() {
        return channel;
    }
    public void setChannel(String channel) {
        this.channel = channel;
    }

    }
    
}
