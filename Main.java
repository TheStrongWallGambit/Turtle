import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.awt.*;


public class Main {
  public static void main(String[] args) {  
    World world = new World(300,300);

    World world2 = new World();
   
    World world3 = new World();
     
    Turtle yertle = new Turtle(world);

    Turtle marc = new Turtle( 400, 800, world2);

    Turtle jenny = new Turtle( 400, 800, world3);
    // // Add your code here
    yertle.forward();
    yertle.turnRight();
    yertle.forward();
    yertle.turnRight();
    yertle.forward();
    yertle.turnRight();
    yertle.forward();
    yertle.turnRight();

  
    // //world.setVisible(true);

    // World world2 = new World(true);
   
     
    // Turtle yertle2 = new Turtle(world2);
    // // Add your code here
    // yertle2.forward();
    // yertle2.turnRight();
    // yertle2.forward();

  
    //world.setVisible(true);
  }
}
