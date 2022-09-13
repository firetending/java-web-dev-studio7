package org.launchcode.studio7;

abstract class BaseDisc implements Disc {
    private String name;
    private int capacity;
    private String contents;
    private String discType;
    private int spinSpeed;
    private String readType;
    private String writeType;

    public BaseDisc(String name, String contents) {
        this.setName(name);
        this.setContents(contents);
    }

    @Override
    public String toString() {
        return this.getDiscType()+": "+this.getName()+" ("+this.getContents()+")";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getDiscType() {
        return discType;
    }

    public void setDiscType(String discType) {
        this.discType = discType;
    }

    public int getSpinSpeed() {
        return spinSpeed;
    }

    public void setSpinSpeed(int spinSpeed) {
        this.spinSpeed = spinSpeed;
    }

    public String getReadType() {
        return readType;
    }

    public void setReadType(String readType) {
        this.readType = readType;
    }

    public String getWriteType() {
        return writeType;
    }

    public void setWriteType(String writeType) {
        this.writeType = writeType;
    }
}
