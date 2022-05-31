package com.arka99.spring.vehicleenginespring.main;

import com.arka99.spring.vehicleenginespring.java_app_config.AppConfig;
import com.arka99.spring.vehicleenginespring.vehicles.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class VehicleApplication {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Car fordCar = applicationContext.getBean("car", Car.class);
        fordCar.setCarName("Ford");
        fordCar.startEngine();
        System.out.println("The name of the car is : " + fordCar.getVehicleName());
        Bike hondaBike = applicationContext.getBean("bike",Bike.class);
        hondaBike.setBikeName("Honda");
        hondaBike.startEngine();
        System.out.println("The name of the bike is : " + hondaBike.getVehicleName());
        applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        Bike bike = applicationContext.getBean(Bike.class);
        bike.setBikeName("Yamaha");
        bike.startEngine();
        System.out.println("The name of the bike is : " + bike.getVehicleName());
        Car toyotaCar = applicationContext.getBean(Car.class);
        toyotaCar.setCarName("Toyota");
        toyotaCar.startEngine();
        System.out.println("The name of the car is : " + toyotaCar.getVehicleName());
        AutoRickshaw autoRickshaw = applicationContext.getBean(AutoRickshaw.class);
        autoRickshaw.setAutoRickshawName("CNG");
        autoRickshaw.startEngine();
        System.out.println("The name of the autorickshaw is: " + autoRickshaw.getVehicleName());
        AirPlane airPlane = applicationContext.getBean(AirPlane.class);
        airPlane.setAirplaneName("Fly Emirates");
        airPlane.startEngine();
        System.out.println("The name of the airplane is : " + airPlane.getVehicleName());

    }
}
