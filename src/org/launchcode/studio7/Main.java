package org.launchcode.studio7;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        ArrayList<Disc> discs = new ArrayList<>();
        Disc disc1 = new CD("Jagged Little Pill", "Alanis plays the hits");
        Disc disc2 = new DVD("The Blues Brothers", "wearing sunglasses at night on a mission from gahd");
        Disc disc3 = new VinylRecord("Led Zeppelin IV","don't trip on the stairs");
        Disc disc4 = new FloppyDisk("Lode Runner","dig fast, be swift, lode up");
        discs.add(disc1);
        discs.add(disc2);
        discs.add(disc3);
        discs.add(disc4);

        for (Disc disc : discs) {
            System.out.println("\n" + disc);
            disc.spinDisc();
            disc.readFromDisc();
            disc.writeToDisc();
        }

        // TODO: Declare and initialize a CD and a DVD object.

        // TODO: Call each CD and DVD method to verify that they work as expected.

    }
}
