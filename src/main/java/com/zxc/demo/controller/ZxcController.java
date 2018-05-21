package com.zxc.demo.controller;

import com.zxc.demo.config.ConfigBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableConfigurationProperties({ConfigBean.class})
public class ZxcController {
    @Autowired
    ConfigBean configBean;
    @Value("${my.name}")
    private String name;
    @Value("${my.age}")
    private String age;

    @RequestMapping("/zxc")
    public String getNameAge() {
        return "I'm " + name + ",I'm " + age + "years old.";
    }

    @RequestMapping("/config")
    public String lookAtTheConfigBean() {
        return configBean.getAge() + ">>>" + configBean.getGreeting() + ">>>" + configBean.getName() + ">>>" + configBean.getUuid() + ">>>" + configBean.getValue() + ">>>" + configBean.getMax() + ">>>" + configBean.getNumber();
    }

}
