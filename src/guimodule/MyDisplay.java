package guimodule;
import processing.core.PApplet;

public class MyDisplay extends PApplet {

    public void setup(){
        size(400,400);
        background(255,255,255);
    }
    public void draw(){
        fill(255,209,0);
        ellipse(200,200, width , height);
        fill(0,0,0);
        ellipse(120,130 ,50,70);
        ellipse(280,130 ,50,70);
        noFill();
        arc(200,220,200,180,0,PI);
    }

    public static void main(String[] args) {
        PApplet.main("guimodule.MyDisplay");
    }

}
