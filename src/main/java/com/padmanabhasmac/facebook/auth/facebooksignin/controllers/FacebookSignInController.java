package com.padmanabhasmac.facebook.auth.facebooksignin.controllers;

import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class FacebookSignInController {

    @GetMapping("/home")
    public String welcome(Principal principal) {
        System.out.println("Welcome method init");
//        Map<String, Object> userDetails = (Map<String, Object>) ((OAuth2AuthenticationToken) principal).getDetails();
//        String userName = (String) userDetails.get("name");
        return "Hi " + ((OAuth2AuthenticationToken) principal).getPrincipal().getAttribute("name") + " Welcome to my application, logged in with Facebook!!!";
    }
}
