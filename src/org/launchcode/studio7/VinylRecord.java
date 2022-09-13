package org.launchcode.studio7;

public class VinylRecord extends BaseDisc {

    private int diameterInches;

    public VinylRecord(String name, String contents) {
        this(name, contents, 340, 33);
    }

    public VinylRecord(String name, String contents, int capacity, int spinSpeed) {
        super(name, contents);
        this.setCapacity(capacity);
        this.setSpinSpeed(spinSpeed);
        this.setDiscType("LP");
        this.setReadType("needle");
        this.setWriteType("heat press");
        this.setDiameterInches(spinSpeed);
    }

    public int getDiameterInches() {
        return diameterInches;
    }

    public void setDiameterInches(double spinSpeed) {
        if (spinSpeed == 33) {
            this.diameterInches = 12;
        } else if (spinSpeed == 45) {
            this.diameterInches = 7;
        } else if (spinSpeed == 78) {
            this.diameterInches = 10;
        } else {this.diameterInches = 0;}
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
}
