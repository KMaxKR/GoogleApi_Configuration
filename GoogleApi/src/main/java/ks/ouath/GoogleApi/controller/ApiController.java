package ks.ouath.GoogleApi.controller;

import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class ApiController {
    @GetMapping("/")
    public String openEndpoint(){
        return "Open EndPoint";
    }

    @GetMapping("/close")
    public String restrictedEndpoint(Principal principal){
        return "Restricted EndPoint" + principal.getName();
    }

    @GetMapping("/info")
    public String infoPage(OAuth2AuthenticationToken oAuth2AuthenticationToken){
        return oAuth2AuthenticationToken.toString();
    }
}
