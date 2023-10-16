package com.codewithmosh.state.abuse;

public class Stopwatch {

    private State currState = new StoppedState(this);

    public void click(){
        currState.click();
    }

    public void setCurrentState(State state){
        this.currState = state;
    }
    
}
