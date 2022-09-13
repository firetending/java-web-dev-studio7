package org.launchcode.studio7;

public abstract class OpticalDisc extends BaseDisc {
    public OpticalDisc(String name, String contents) {
        super(name, contents);
        this.setReadType("laser");
        this.setWriteType("laser");
    }
}
