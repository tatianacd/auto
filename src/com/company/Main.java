package com.company;

public class Main {
    MotorAudi motorAudi = new MotorAudi();
    MotorPeugeot motorPeugeot = new MotorPeugeot();
    MotorFord motorFord = new MotorFord();
    Auto auto = new Auto(motorAudi, "12345670", 5);
    Auto auto1 = new Auto(motorFord, "1234567012", 6);
    Auto auto2 = new Auto(motorPeugeot, "123456703", 7);


    public static void main(String[] args) {
        // write your code here

    }
}