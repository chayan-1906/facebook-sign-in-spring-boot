package com.padmanabhasmac.facebook.auth.facebooksignin.controllers;

import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class FacebookSignInController {

    @GetMapping("/auth/facebook")
    public String welcome(Principal principal) {
        OAuth2User principal1 = ((OAuth2AuthenticationToken) principal).getPrincipal();
        String name = principal1.getAttribute("name");
        String email = principal1.getAttribute("email");
        String profilePicture = principal1.getAttribute("picture");
        System.out.println("principal = " + principal);
        System.out.println("principal1 = " + principal1);
        System.out.println("name: " + name);
        System.out.println("email: " + email);
        System.out.println("profilePicture: " + profilePicture);
        return "Hi " + ((OAuth2AuthenticationToken) principal).getPrincipal().getAttribute("name") + " Welcome to my application, logged in with Facebook!!!";
    }
}
