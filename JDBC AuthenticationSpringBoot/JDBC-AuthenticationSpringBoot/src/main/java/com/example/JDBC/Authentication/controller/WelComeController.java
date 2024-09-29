package com.example.JDBC.Authentication.controller;



    import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

    @Controller
    public class WelComeController {

        @GetMapping("/welcome")
        public String greeting() {
            return "welcome";
        }

        @GetMapping("/login")
        public String login(){
            return "login";
        }

}
