package org.launchcode.studio7;

public interface Disc {
    void spinDisc();
    void readFromDisc();
    void writeToDisc();
    @Override
    String toString();
}

// To code a Frisbee or Wheel class, I would move the read/write methods from this interface into the abstract
// BaseDisc and rename it to DataDisc. Then only spinDisc would be implemented when implementing Disc.
// I might have Frisbee and Wheel directly implement Disc until I found a proper abstract class they could extend.