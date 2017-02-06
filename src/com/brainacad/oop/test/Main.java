package com.brainacad.oop.test;

import com.brainacad.oop.mycar.Car;
import com.brainacad.oop.sportcar.SportCar;

/**
 * Created by visartsim on 06.02.17.
 */
public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        SportCar mySportCar = new SportCar();
        int i1;
        //i1 = myCar.maxSpeed;
        i1 = mySportCar.getMaxSpeed();
        //myCar.move();
        mySportCar.move();
    }
}