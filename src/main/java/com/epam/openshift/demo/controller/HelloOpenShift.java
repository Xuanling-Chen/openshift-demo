package com.epam.openshift.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloOpenShift {

    @GetMapping("/")
    public String sayHello(){
        return "openshift demo:<br>" +
                "\t1. download crc and pull-secret.txt<br>\n" +
                "\t2. run 'crc setup'<br>\n" +
                "\t3. run 'crc start -p pull-secret.txt'<br>\n" +
                "\t4. run 'crc console'<br>\n" +
                "\t5. create a project from git'<br>\n" +
                "\t6. build the project<br>\n" +
                "\t7. change the lable 'app.openshift.io/runtime=java' to 'app.openshift.io/runtime=rh-spring-boot'<br>\n" +
                "\t8. check tht api";

    }
}
