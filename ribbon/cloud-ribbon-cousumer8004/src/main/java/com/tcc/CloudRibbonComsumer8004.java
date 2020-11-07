package com.tcc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id 2020年11月07日 13:20 CloudRibbonComsumer8004.java $Exp
 * @auter taoch
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CloudRibbonComsumer8004 {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }


    public static void main(String args[]){
        SpringApplication.run(CloudRibbonComsumer8004.class, args);
    }


    @RestController
    public static class TestController{

        @Autowired
        private RestTemplate restTemplate;

        @GetMapping(value = "/ribbon")
        public String ribbon(){
            return restTemplate.getForObject("http://cloud-eureka-producer/produce/service", String.class);
        }

    }

}
