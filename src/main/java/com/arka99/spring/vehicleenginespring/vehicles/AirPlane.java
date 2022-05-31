package com.arka99.spring.vehicleenginespring.vehicles;

import com.arka99.spring.vehicleenginespring.engine.Engine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AirPlane implements Vehicle{
    private String airplaneName;
    private Engine engine;
    private String engineType;

    public AirPlane() {

    }
    public void setAirplaneName(String airplaneName) {
        this.airplaneName = airplaneName;
    }
    @Autowired
    public void setEngine(Engine engine) {
        this.engine = engine;
        this.engineType = engine.getClass().toString();
    }

    @Override
    public String getVehicleName() {
        return this.airplaneName;
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
