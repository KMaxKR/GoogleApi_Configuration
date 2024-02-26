package ks.ouath.GoogleApi.controller;

import lombok.AllArgsConstructor;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class ApiController {

    @GetMapping("/")
    public String openEndpoint(){
        return "Open EndPoint";
    }


    @GetMapping("/info")
    public String infoPage(OAuth2AuthenticationToken oAuth2AuthenticationToken){
        return oAuth2AuthenticationToken.toString();
    }
}
