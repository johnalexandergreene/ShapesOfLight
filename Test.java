package org.fleen.shapesOfLight;

import processing.core.PApplet;

public class Test extends PApplet {

    // The argument passed to main must match the class name
    public static void main(String[] args) {
//        PApplet.main("Test");
        PApplet.main(new String[] { "--present", Test.class.getName() });
    }

    // method for setting the size of the window
    public void settings(){
        size(500, 500);
    }

    // identical use to setup in Processing IDE except for size()
    public void setup(){
        background(0);
        stroke(255);
        strokeWeight(10);
    }

    // identical use to draw in Prcessing IDE
    public void draw(){
        line(0, 0, 500, 500);
    }
}
