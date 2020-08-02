package com.tcc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.text.MessageFormat;
import java.util.List;
import java.util.Optional;

/**
 * @version $Id 2020年08月02日 9:44 ComsumerController.java $Exp
 * @auter taoch
 */
@RestController
public class ConsumerController {

    /**
     * 用于发现服务，获取服务实例信息
     */
    @Autowired
    private DiscoveryClient client;

    /**
     * http客户端，访问http使用
     */
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/consume/service", method = RequestMethod.GET)
    public ResponseEntity<String> consume(){
        // 根据服务名称获取服务实例信息 cloud-eureka-producer
        List<ServiceInstance> instances = client.getInstances("cloud-eureka-producer");
        ServiceInstance instance = Optional.ofNullable(instances).map(i -> i.stream().findFirst().orElse(null))
                .orElseThrow(()-> new RuntimeException("无可用访问实例"));
        String url = MessageFormat.format("http://{0}:{1}/produce/service", instance.getHost(), String.valueOf(instance.getPort()));
        return restTemplate.getForEntity(url, String.class);
    }

}
