package com.weegle.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AService {

    @RequestMapping("/gethello")
    public String getHello(){
        return "Bonjour Cedrick comment  vas  tu?" +
                "je suis malade.\n" +
                "On va voir le medecin demain du coup. il faut beau aujourd hui";
    }

    @RequestMapping("/")
    public String servicename(){
        return "Service A";
    }

}
