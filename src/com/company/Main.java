package com.company;

public class Main {

    public static void main(String[] args) {
        StopLight theStopLight = new StopLight();
        Car myCar = new Car("silver", "Nissan", 250);

        for (int i = 0; i < 30; i++) {
            if (theStopLight.isGreen()){
                theStopLight.setLightColor("Yellow");
                myCar.slow();
            }

            else if (theStopLight.isYellow()){
                theStopLight.setLightColor("Red");
                myCar.stop();
            }

            // Default Value is Red
            // Loop starts here isRed()
            else if (theStopLight.isRed()){
                theStopLight.setLightColor("Green");
                myCar.go();
            }
        }
    }
}
