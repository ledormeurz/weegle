package com.weegle.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BService {

    @RequestMapping("/gethello")
    public String getHello(){
        return "Bonjour je suis BBB. Et je suis nouveau test encore";
    }



}
