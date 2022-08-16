package org.launchcode.studio7;

public class CD extends BaseDisc implements OpticalDisc{
    public CD (String name, String contents) {
        super(name, contents);
        this.setDiscType("CD");
        this.setCapacity(700);
        this.setSpinSpeed(5000);
    }

    public CD (String name, String contents, double capacity, double spinSpeed) {
        super(name, contents);
        this.setDiscType("CD");
        this.setCapacity(capacity);
        this.setSpinSpeed(spinSpeed);
    }

    @Override
    public void spinDisc() {
        System.out.println("CD is spinning NOW");
    }

    @Override
    public void laserRead() {
        System.out.println("reading this CD loud and clear");
    }

    @Override
    public void laserWrite() {
        System.out.println("writing to this CD like it's our job");
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.



}
