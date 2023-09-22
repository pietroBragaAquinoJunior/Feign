package com.pietrobaj.feign_java_21.feignClients;

import com.pietrobaj.feign_java_21.models.RandomUserResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "RandomUserClient", url="https://randomuser.me/api")
public interface RandomUserClient {
    @RequestMapping(method = RequestMethod.GET, value = "/")
    RandomUserResult getUsers();
}
