package com.brainacad.clone;

import java.text.SimpleDateFormat;
import java.util.Date;

class Car implements Cloneable {
    protected int maxSpeed;
    protected Date manufDate;

    public Car(Date manufDate, int maxSpeed) {
        this.manufDate = manufDate;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Max Speed = " + maxSpeed + " Manufacture date = " + manufDate;
    }

    public Object clone() throws CloneNotSupportedException {
        Car car = (Car) super.clone();
        car.manufDate = (Date) car.manufDate.clone();
        return car;
    }

}

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        Date dt = sdf.parse("06.02.2017");
        Car myCar1 = new Car(dt, 260);
        System.out.println(myCar1);
        Car myCar2 = (Car) myCar1.clone();
        System.out.println(myCar2);
        myCar1.manufDate.setTime(1486332000);
        System.out.println(myCar1);
        System.out.println(myCar2);
    }
}
