package com.example.alt.altchecker;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class ApiList {

    public static void hitAltBalajiApi(User user) {
        final RestTemplate restTemplate = new RestTemplate();
        String url = "https://api.cloud.altbalaji.com/accounts/login?domain=IN";
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));

        // create a map for post parameters
        Map<String, Object> map = new HashMap<>();
        map.put("username",user.getUserName());
        map.put("password",user.getUserPassword());

        // build the request
        HttpEntity<Map<String, Object>> entity = new HttpEntity<>(map, headers);

        // send POST request
        try {
            ResponseEntity<String> response = restTemplate.postForEntity(url, entity, String.class);
            System.out.println(response.getBody());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
