package com.spring.demo;

import java.util.Random;

public class EcommerceServiceImpl implements BusinessService{
    public String offerService(String companyName) {
        Random random = new Random();
        String service = companyName + " provides E-commerce Service with revenue " + random.nextInt(revenue);
        return service;
    }
}
