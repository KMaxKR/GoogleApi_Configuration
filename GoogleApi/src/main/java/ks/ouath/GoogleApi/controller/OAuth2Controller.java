package ks.ouath.GoogleApi.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@AllArgsConstructor
@Controller
public class OAuth2Controller {

    @GetMapping("/authentication")
    public String oauthPage() {
        return "login";
        // TODO: 09.03.2024  finish endpoint auth and receiving data 
    }
}
