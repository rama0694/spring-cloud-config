package com.microservice.limitsservice;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
@Data
public class Test {
    @Value("${test}")
    private int test;
}
