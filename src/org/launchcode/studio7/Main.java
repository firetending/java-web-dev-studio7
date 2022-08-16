package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){
        CD alanis = new CD("Jagged Little Pill", "Alanis plays the hits");
        DVD blues = new DVD("The Blues Brothers", "Wearing sunglasses at night on a mission from gahd");

        alanis.spinDisc();
        alanis.laserRead();
        alanis.laserWrite();

        blues.spinDisc();
        blues.laserRead();
        blues.laserWrite();

        // TODO: Declare and initialize a CD and a DVD object.

        // TODO: Call each CD and DVD method to verify that they work as expected.

    }
}
