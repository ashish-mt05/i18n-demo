package com.example.i18ndemo.controller;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
public class TestController {

    private MessageSource messageSource;

    public TestController(MessageSource messageSource){
        this.messageSource = messageSource;
    }
    @GetMapping("/i18n")
    public String i18nDemo(){
        Locale local = LocaleContextHolder.getLocale();
        return messageSource.getMessage("test.name", null,"default message", local);
    }

    @GetMapping("/test")
    public String test(){

        return "SUCCESS";
    }
}
