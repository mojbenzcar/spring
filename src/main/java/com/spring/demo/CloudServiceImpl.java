package com.spring.demo;

import java.util.Random;

public class CloudServiceImpl implements BusinessService {
    public String offerService(String companyName) {

        Random random = new Random();
        String service = companyName + " provides Cloud Service with revenue " + random.nextInt(revenue);
        return service;
    }
}
