package com.iesemilidarder.pmarch.projectpmarch.data;

//tipo de visibilidad, que se extiende a Car y luego tiene ser implementado.
public class AmfibiusCar extends Car implements  INavigation {
    public void doFloat() {
       doLog("Como mola como floto");
    }

}
