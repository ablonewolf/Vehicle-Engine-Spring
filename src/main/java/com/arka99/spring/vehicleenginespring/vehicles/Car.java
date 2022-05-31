package com.arka99.spring.vehicleenginespring.vehicles;

import com.arka99.spring.vehicleenginespring.engine.Engine;

public class Car implements Vehicle{

    private String carName;
    private String engineType;
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
        this.engineType = this.engine.getClass().toString();
    }

    public Engine getEngine() {
        return this.engine;
    }
    public void setCarName(String carName) {
        this.carName = carName;
    }
    @Override
    public String getVehicleName() {
        return this.carName;
    }

    @Override
    public String getEngineType() {
        return this.engineType;
    }

    @Override
    public void startEngine() {
        this.engine.turnOn();
    }
}
