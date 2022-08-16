package org.launchcode.studio7;

abstract class BaseDisc {
    private String name;
    private double capacity;
    private String contents;
    private String discType;
    private double spinSpeed;

    public BaseDisc(String name, String contents) {
        this.setName(name);
        this.setContents(contents);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
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

    public double getSpinSpeed() {
        return spinSpeed;
    }

    public void setSpinSpeed(double spinSpeed) {
        this.spinSpeed = spinSpeed;
    }



}
