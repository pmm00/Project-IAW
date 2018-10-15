package com.iesemilidarder.pmarch.projectpmarch.data;

public abstract class Vehicle {
    private String color;
    private Integer numWheels;
    private Double price;

    public Integer getNumWheels() {
        return numWheels;
    }

    public void setNumWheels(Integer numWheels) {
        this.numWheels = numWheels;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }





    public abstract void start();

    public void brake() {
        doLog("He frenado");
    }

    /**
     * *prints the pessage where it should
     *
     * @param message txt
     */
    protected void doLog(String message) {
        doLog("message");
    }
    //este metodo es privado, no se ejecuta con el resto del programa.
    private String showLog(String message){
        doLog(message);
        return message;
    }

}
