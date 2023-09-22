package com.pietrobaj.feign_java_21.models;

import lombok.Data;

import java.util.List;

@Data
public class RandomUserResult {
    private List<User> results;

}
