package com.example.gcptestproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CloudController {

    //create a get request method that returns a string
@GetMapping("/message")
public String getMessage() {
    return "Hello this is Gazal";
}

    public static class Pokemon {
    }
}
