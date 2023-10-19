package com.codewithmosh.observer;

public class Datasource extends Subject{

    
    private int value;

    public void setValue(int value) {
        this.value = value;
        notifyObservers();
    }

    public int getValue() {
        return value;
    }

   
}
