package com.arka99.spring.vehicleenginespring.engine;

public class ElectricalEngine implements Engine{
    @Override
    public void turnOn() {
        System.out.println("Electrical Engine is being turned on.");
    }
}
