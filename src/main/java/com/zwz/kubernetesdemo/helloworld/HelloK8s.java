package com.zwz.kubernetesdemo.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloK8s {

    @GetMapping("/hello")
    public String helloK8s() {
        return "Hello K8s";
    }
}
