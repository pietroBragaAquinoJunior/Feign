package com.pietrobaj.feign_java_21.services;

import com.pietrobaj.feign_java_21.feignClients.RandomUserClient;
import com.pietrobaj.feign_java_21.models.RandomUserResult;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RandomUserService {

    private final RandomUserClient randomUserClient;

    public RandomUserResult getUsers() {
        return randomUserClient.getUsers();
    }

}
