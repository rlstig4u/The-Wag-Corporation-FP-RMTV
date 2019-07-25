package com.finalproject.java;

public class Singleton {

    private static Singleton instance;

    private int count = 642135;

    public synchronized static Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();

        } // end if statement

        return instance;

    } // end method

    private Singleton() { }

    public synchronized int getNextSerial() { return ++count; }


} // end class
