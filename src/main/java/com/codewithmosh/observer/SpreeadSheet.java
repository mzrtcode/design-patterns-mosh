package com.codewithmosh.observer;

public class SpreeadSheet implements Observer{

    @Override
    public void update() {
       System.out.println("Spreadsheet got notified.");
    }
    
}
