package com.arka99.spring.vehicleenginespring.engine;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CombustionEngine  implements Engine{
    @Override
    public void turnOn() {
        System.out.println("Combustion Engine is being turned on.");
    }
}
