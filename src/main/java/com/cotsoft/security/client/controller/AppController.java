package com.cotsoft.security.client.controller;

import com.cotsoft.security.client.model.Message;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Map;

@RestController
public class AppController {

    //Servidor de recursos
    @GetMapping("/list")
    public List<Message> getMessages() {
        return List.of(new Message("Hello, World!"));
    }

    @PostMapping("/create")
    public Message postMessage(@RequestBody Message message) {
        System.out.println("Received message: " + message.getText());
        return message;
    }

    //Cliente
    @GetMapping("/authorized")
    public Map<String, String> authorized(@RequestParam String code){
        return Collections.singletonMap("code", code);
    }
}
