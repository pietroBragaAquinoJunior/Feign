package com.pietrobaj.feign_java_21.feignClients;

import com.pietrobaj.feign_java_21.models.RandomUserResult;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "RandomUserClient", url = "https://randomuser.me/api")
public interface RandomUserClient {
    @CircuitBreaker(name = "randomUserApi", fallbackMethod = "fallbackGetUsers")
    @RequestMapping(method = RequestMethod.GET, value = "/")
    RandomUserResult getUsers();

    default RandomUserResult fallbackGetUsers(Exception ex) {
        return new RandomUserResult();
    }

}
