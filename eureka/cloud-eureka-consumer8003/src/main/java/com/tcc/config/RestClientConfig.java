package com.tcc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @version $Id 2020年08月02日 9:47 RestClientConfig.java $Exp
 * @auter taoch
 */
@Configuration
public class RestClientConfig {

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

}
