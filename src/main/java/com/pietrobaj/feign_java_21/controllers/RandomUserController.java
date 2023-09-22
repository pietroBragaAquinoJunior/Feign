package com.pietrobaj.feign_java_21.controllers;

import com.pietrobaj.feign_java_21.models.RandomUserResult;
import com.pietrobaj.feign_java_21.services.RandomUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/randomuser")
public class RandomUserController {
    private final RandomUserService randomUserService;

    @GetMapping("/")
    public RandomUserResult getUsers(){
        return randomUserService.getUsers();
    }
}
