package com.stripe.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class myController {
    @PostMapping("/endpoint")
    public String handlePostRequest(@RequestBody String request) {
        System.out.println("Получен POST-запрос: " + request);

        // Здесь можно добавить код для обработки запроса и формирования ответа

        return "Ответ на POST-запрос";
    }
}
