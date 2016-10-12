package com.company;

/**
 * Created by student on 10/11/16.
 */
public class StopLight {
    String mLightColor;

    public StopLight(){
        // Default Value
        mLightColor = "Red";
    }

    public boolean isRed(){
        return mLightColor.equals("Red");
    }

    public boolean isYellow(){
        return mLightColor.equals("Yellow");
    }

    public boolean isGreen(){
        return mLightColor.equals("Green");
    }

    public void setLightColor(String lightColor){
        if (lightColor.isEmpty()){
            System.out.println("Can Not Be Empty");
        } else {
            mLightColor = lightColor;
            System.out.println("The light is now "+lightColor);
        }
    }

}
