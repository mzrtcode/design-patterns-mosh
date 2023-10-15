package com.codewithmosh.state;


public class Canvas {

    private Tool currentTool;


    public void mouseDown(){
        currentTool.mouseDown();
    }

    public void mouseUp(){
        currentTool.mouseUp();
    }

    public Tool getCuTool(){
        return currentTool;
    }

    public void setCurrentTool(Tool currentTool){
        this.currentTool = currentTool;
    }


}
