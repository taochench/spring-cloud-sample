package com.tcc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.text.MessageFormat;
import java.util.UUID;

/**
 * @version $Id 2020年11月07日 13:28 CloudEurekaProducer8002.java $Exp
 * @auter taoch
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CloudEurekaProducer8002 {
    public static void main(String args[]){
        SpringApplication.run(CloudEurekaProducer8002.class, args);
    }

    @RestController
    public static class ProducerController {

        @Value("${server.port}")
        private int port;

        @RequestMapping(value = "/produce/service", method = RequestMethod.GET)
        public String service(){
            return MessageFormat.format("ID:{0}  PORT:{1}", UUID.randomUUID().toString(), port);
        }

    }

}
