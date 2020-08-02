package com.tcc.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.text.MessageFormat;
import java.util.UUID;

/**
 * @version $Id 2020年08月02日 9:40 ServiceController.java $Exp
 * @auter taoch
 */
@RestController
public class ProducerController {

    @Value("${server.port}")
    private int port;

    @RequestMapping(value = "/produce/service", method = RequestMethod.GET)
    public String service(){
        return MessageFormat.format("ID:{0}  PORT:{1}", UUID.randomUUID().toString(), port);
    }

}
