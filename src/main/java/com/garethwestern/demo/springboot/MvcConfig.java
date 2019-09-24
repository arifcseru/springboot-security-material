package com.garethwestern.demo.springboot;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class MvcConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addRedirectViewController("/", "/home");
        registry.addViewController("/admin").setViewName("admin");
        registry.addViewController("/login").setViewName("signin");
        registry.addViewController("/registration").setViewName("registration");
        registry.addViewController("/dashboard").setViewName("dashboard");
        registry.addViewController("/signin").setViewName("signin");
        registry.addViewController("/home").setViewName("home");
    }

}