package com.codewithmosh.mediator;

public class Button extends UIControl{
    
    private Boolean isEnabled;

    public Button(DialogBox owner) {
        super(owner);
    }

    
 

    public void enabled (Boolean isEnabled) {
        this.isEnabled = isEnabled;
        owner.changed(this);
    }

    public Boolean isEnabled() {
        return isEnabled;
    }



    
}
