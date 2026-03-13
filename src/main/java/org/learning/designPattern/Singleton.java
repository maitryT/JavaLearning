package org.learning.designPattern;

public class Singleton {
    private static Singleton INTSTANCE;

    public static Singleton getInstance(){
        if(INTSTANCE == null){
            INTSTANCE = new Singleton();
        }
        return INTSTANCE;
    }

    public void print(){
        System.out.println("Object Printed");
    }
}
