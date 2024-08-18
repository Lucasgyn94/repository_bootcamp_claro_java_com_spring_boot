package me.dio.springWebApi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

   @GetMapping
    public String boasVIndas() {
       return "Ola lucas";
   }
}
