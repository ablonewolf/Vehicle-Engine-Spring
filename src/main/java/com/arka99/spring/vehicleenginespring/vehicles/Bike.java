package com.arka99.spring.vehicleenginespring.vehicles;

import com.arka99.spring.vehicleenginespring.engine.Engine;

public class Bike implements Vehicle{

    private String bikeName;
    private String engineType;
    private Engine engine;

   public Bike() {

   }

    public void setBikeName(String bikeName) {
        this.bikeName = bikeName;
    }
    @Override
    public String getVehicleName() {
        return this.bikeName;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
        this.engineType = this.engine.getClass().toString();
    }
    public Engine getEngine() {
        return this.engine;
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
