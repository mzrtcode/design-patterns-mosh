package com.codewithmosh.command;

import com.codewithmosh.command.fx.Command;

public class Button {

    private String label;
    private Command command;

    public Button(Command command){
        this.command = command;
    }

    public void click(){
        // Al momento de diseñar este framework, no sabemos que codigo se va a ejecutar
        // cuando se haga click en el boton, el patron Command apunta a resolver este problema
        command.execute();
    }

    public void setLabel(String label){
        this.label = label;
    }
    
    public String getLabel(){
        return label;
    } 
}
