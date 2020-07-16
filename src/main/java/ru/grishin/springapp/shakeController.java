/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.grishin.springapp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author grish
 */

@Controller
public class shakeController {
    @Value("${snake.name}")
    private String name;
    
    @GetMapping(value="/snake")
    public String saySnake(){
        return name;
    }
  
    @GetMapping("/")
    public String sayHello(){
        return name;
    }
    
}
