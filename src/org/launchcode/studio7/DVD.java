package org.launchcode.studio7;

public class DVD extends BaseDisc implements OpticalDisc {
    public DVD (String name, String contents, double capacity, double spinSpeed) {
        super(name, contents);
        this.setDiscType("DVD");
        this.setCapacity(capacity);
        this.setSpinSpeed(spinSpeed);
    }

    public DVD (String name, String contents) {
        super(name, contents);
        this.setDiscType("DVD");
        this.setCapacity(4700);
        this.setSpinSpeed(5000);
    }



    @Override
    public void spinDisc() {
        System.out.println("DVD is spinning");
    }

    @Override
    public void laserRead() {
        System.out.println("Wow we're reading so much data from this DVD");
    }

    @Override
    public void laserWrite() {
        System.out.println("Write mode activated: let's give this DVD some data");
    }


    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
