package com.tcc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @version $Id 2020年08月02日 9:36 CloudEurekaConsumer8003.java $Exp
 * @auter taoch
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CloudEurekaConsumer8003 {

    public static void main(String[] args) {
        SpringApplication.run(CloudEurekaConsumer8003.class, args);
    }

}
