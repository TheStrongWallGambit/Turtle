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

    Turtle marc = new Turtle( 400, 800, world);

    Turtle jenny = new Turtle( 400, 800, world);

    Turtle adam = new Turtle(400, 800, world);
    // // Add your code here
    yertle.setShellColor(Color.green);
    marc.setShellColor(Color.blue);
    jenny.setShellColor(Color.pink);
    adam.setShellColor(Color.RED);
    System.out.println(jenny.getShellColor());

    marc.setPenColor(Color.BLACK);
    yertle.setPenWidth(40);
    yertle.forward();
    yertle.turnRight();
    yertle.forward();
    yertle.turnRight();
    yertle.forward();
    yertle.turnRight();
    yertle.forward();
    yertle.turnRight();

    marc.turnToFace(yertle);
    
    System.out.print(yertle.getDistance(0, 0));

    marc. polygon(5.0, 100);
  
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
