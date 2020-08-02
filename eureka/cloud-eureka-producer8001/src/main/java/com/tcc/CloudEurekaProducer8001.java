package com.tcc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @version $Id 2020年08月02日 9:27 CloudEurekaProducer.java $Exp
 * @auter taoch
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CloudEurekaProducer8001 {

    public static void main(String[] args) {
        SpringApplication.run(CloudEurekaProducer8001.class, args);
    }

}
