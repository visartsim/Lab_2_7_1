package com.brainacad.oop.sportcar;

import com.brainacad.oop.mycar.Car;

/**
 * Created by visartsim on 06.02.17.
 */
public class SportCar extends Car {
    private int maxSpeed = 160;

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void move() {
        System.out.println(super.maxSpeed + 100);
    }
}
