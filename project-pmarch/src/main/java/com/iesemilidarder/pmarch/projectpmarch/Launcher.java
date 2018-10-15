package com.iesemilidarder.pmarch.projectpmarch;

import com.iesemilidarder.pmarch.data.Moto;
import com.iesemilidarder.pmarch.data.Vehicle;

public class Launcher {
    //esto es para decirle a java que es ejecutable
    public static void main (String... args) {
        System.out.println("concesionario brum brum App 2.0");
        Moto moto =new Moto ();

        moto.setNumWheels(2);
        moto.setPrice(123.45);
        moto.setColor("Blanco");

        System.out.println (moto.getNumWheels());
        moto.start();
        System.out.println("pista que voy");
        moto.brake();
        Vehicle aux = new Moto();
    }
}
