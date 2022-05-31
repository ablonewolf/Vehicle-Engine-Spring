package com.arka99.spring.vehicleenginespring.java_app_config;

import com.arka99.spring.vehicleenginespring.engine.CombustionEngine;
import com.arka99.spring.vehicleenginespring.engine.ElectricalEngine;
import com.arka99.spring.vehicleenginespring.engine.Engine;
import com.arka99.spring.vehicleenginespring.vehicles.Bike;
import com.arka99.spring.vehicleenginespring.vehicles.Car;
import com.arka99.spring.vehicleenginespring.vehicles.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(value = "com.arka99.spring.vehicleenginespring.vehicles")
public class AppConfig {
    @Bean(name = "electricalEngine")
    public Engine getElectricalEngine() {
        return new ElectricalEngine();
    }

    @Bean(name= "combustionEngine")
    @Primary
    public Engine getCombustionEngine() {
        return new CombustionEngine();
    }

    @Bean(name = "bike")
    public Vehicle getBike() {
        Bike bike = new Bike();
        bike.setEngine(getCombustionEngine());
        return bike;
    }

    @Bean(name = "Car")
    public Vehicle getCar() {
        return new Car(getElectricalEngine());
    }
}
