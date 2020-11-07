package com.tcc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version $Id 2020年11月07日 13:38 CloudOpenFeignConsumer8005.java $Exp
 * @auter taoch
 */
@SpringBootApplication
@EnableFeignClients
public class CloudOpenFeignConsumer8005 {
    public static void main(String args[]){
        SpringApplication.run(CloudOpenFeignConsumer8005.class, args);
    }

    @RestController
    public static class TestController{

        @Autowired
        private MyOpenFeignClient feignClient;

        @GetMapping(value = "/feign")
        public String ribbon(){
            return feignClient.service();
        }

    }



    @FeignClient(name = "cloud-eureka-producer")
    public static interface MyOpenFeignClient{

        @RequestMapping(value = "/produce/service", method = RequestMethod.GET)
        String service();
    }

}
