package com.arka99.spring.vehicleenginespring.vehicles;

import com.arka99.spring.vehicleenginespring.engine.Engine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AutoRickshaw implements Vehicle{

    private String autoRickshawName;
    private String engineType;
    private Engine engine;
    @Autowired
    public AutoRickshaw(Engine engine) {
        this.engine = engine;
        this.engineType = this.engine.getClass().toString();
    }

    public void setAutoRickshawName(String autoRickshawName) {
        this.autoRickshawName = autoRickshawName;
    }

    @Override
    public String getVehicleName() {
        return this.autoRickshawName;
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
