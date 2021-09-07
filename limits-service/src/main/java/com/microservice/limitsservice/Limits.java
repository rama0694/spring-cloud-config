package com.microservice.limitsservice;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Limits {
    private int min;
    private int max;
}
