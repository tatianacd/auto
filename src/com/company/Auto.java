package com.company;

public class Auto {
    private Motor motor;
    private String patente;
    private Integer cantidadPuertas;

    public Auto(Motor motor, String patente, Integer cantidadPuertas) {
        this.motor = motor;
        this.patente = patente;
        this.cantidadPuertas = cantidadPuertas;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public Integer getCantidadPuertas() {
        return cantidadPuertas;
    }

    public void setCantidadPuertas(Integer cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "motor=" + motor +
                ", patente='" + patente + '\'' +
                ", cantidadPuertas=" + cantidadPuertas +
                '}';
    }
}
