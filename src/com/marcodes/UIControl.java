package com.marcodes;

public abstract class UIControl {
    private boolean isEnabled = true;

//    public  UIControl(boolean isEnabled){
//        this.isEnabled = isEnabled;
//    }

    public abstract void render();

    public void disable(){
        isEnabled = false;
    }
    public void enable(){
        isEnabled = true;
    }
    public boolean isEnabled() {
        return isEnabled;
    }
}
