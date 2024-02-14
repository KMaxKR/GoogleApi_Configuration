package ks.ouath.GoogleApi.controller;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.security.Principal;

@RestController
public class ApiController {

    private static final String PATH_OAUTH = "http://localhost:8090/oauth2/authorization/google";

    @GetMapping("/")
    public String openEndpoint(){
        return "Open EndPoint";
    }

    @GetMapping("/authentication")
    public void restrictedEndpoint(HttpServletResponse response) throws IOException {
        response.sendRedirect(PATH_OAUTH);
    }

    @GetMapping("/info")
    public String infoPage(OAuth2AuthenticationToken oAuth2AuthenticationToken){
        return oAuth2AuthenticationToken.toString();
    }
}
