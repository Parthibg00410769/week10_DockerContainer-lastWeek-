package com.ie.atu;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name= "confirm", url = "http://localhost:8082")
public interface RegistrationServiceClient {

    @PostMapping("/confirm")
    String someDetails(@RequestBody UserDetails userDetails);
}
