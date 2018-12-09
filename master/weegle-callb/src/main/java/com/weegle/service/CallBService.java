package com.weegle.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Date;

@RestController
public class CallBService {

    @Autowired
    Environment env;

    @RequestMapping("/getc")
    public String getHello(){
        RestTemplate restTemplate = new RestTemplate();
        String path = env.getProperty("WEEGLE_B_SVC_PORT")+"/gethello";
        String returnFromB = restTemplate.getForObject(path,String.class);
        String ret = "I m service C, its :"+new Date() +" the return from B is : "+returnFromB;
        return ret;
    }



}
