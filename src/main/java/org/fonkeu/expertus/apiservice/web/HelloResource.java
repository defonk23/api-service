/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fonkeu.expertus.apiservice.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author TN
 */
@RestController
@RequestMapping("/api")
public class HelloResource {
    private final Logger log= LoggerFactory.getLogger(getClass());
    @GetMapping("/hello")
    public String hello(@RequestParam("name") String aux){
        log.info("Appel de Hello");
        return "Hello, "+aux;
    }
    
}
