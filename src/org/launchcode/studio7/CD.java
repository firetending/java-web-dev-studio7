package org.launchcode.studio7;

public class CD extends OpticalDisc{
    public CD (String name, String contents) {
        //use defaults for capacity and spinSpeed
        this(name,contents,700,5000);
    }

    public CD (String name, String contents, int capacity, int spinSpeed) {
        super(name, contents);
        this.setDiscType("CD");
        this.setCapacity(capacity);
        this.setSpinSpeed(spinSpeed);
    }

    @Override
    public void spinDisc() {
        System.out.format("The %s is spinning at %s RPM%n",this.getDiscType(),this.getSpinSpeed());
    }

    @Override
    public void readFromDisc() {
        System.out.format("Wow we're reading up to %sMB from this %s using a %s%n",this.getCapacity(),
                this.getDiscType(),
                this.getReadType());
    }

    @Override
    public void writeToDisc() {
        System.out.format("Write mode activated: let's give this %s some data using a %s%n",this.getDiscType(),
                this.getWriteType());
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.



}
