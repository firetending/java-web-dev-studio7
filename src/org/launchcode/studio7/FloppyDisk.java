package org.launchcode.studio7;

public class FloppyDisk extends BaseDisc {

    public FloppyDisk(String name, String contents) {
        this(name, contents, 120, 300);
    }

    public FloppyDisk(String name, String contents, int capacity, int spinSpeed) {
        super(name, contents);
        this.setCapacity(capacity);
        this.setSpinSpeed(spinSpeed);
        this.setDiscType("Floppy");
        this.setReadType("magnet");
        this.setWriteType("magnet");
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
