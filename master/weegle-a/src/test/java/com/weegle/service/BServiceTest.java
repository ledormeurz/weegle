package com.weegle.service;

import org.junit.Test;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class BServiceTest {

    @Test
    public void test(){

    }
   // @Test
    public void getHello() throws InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();

       for(int i = 0 ; i < 30;i++){
           executorService.submit(new Runnable() {
               @Override
               public void run() {
                   RestTemplate restTemplate = new RestTemplate();

                   while(true){
                        double random = 10 * Math.random();
                        System.out.println(random);
                       restTemplate.getForEntity("http://localhost:32398/a",String.class);
                       if(random<7){
                           restTemplate.getForEntity("http://localhost:32398/something",String.class);
                       }
                      // try {
                        //   Thread.sleep(1);
                     //  } catch (InterruptedException e) {
                    //       e.printStackTrace();
                     //  }

                   }


               }
           });
       }

        executorService.awaitTermination(1000000, TimeUnit.SECONDS);
    }
}