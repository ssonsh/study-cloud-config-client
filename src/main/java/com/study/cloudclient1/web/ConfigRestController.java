package com.study.cloudclient1.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ConfigRestController {

    @Value("${sson.hello}")
    private String hello;

    @GetMapping("/test")
    public String test(){
        return hello;
    }

}
