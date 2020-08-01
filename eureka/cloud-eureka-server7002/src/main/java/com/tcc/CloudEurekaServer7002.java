package com.tcc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @version $Id 2020年08月01日 10:32 CloudEurekaServer7002.java $Exp
 * @auter taoch
 */
@SpringBootApplication
@EnableEurekaServer
public class CloudEurekaServer7002 {

    public static void main(String[] args) {
        SpringApplication.run(CloudEurekaServer7002.class, args);
    }

}
