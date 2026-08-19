import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.awt.*;


public class Main {
  public static void main(String[] args) {  
    World world = new World(800,800);

    Turtle yertle = new Turtle(world);

    Turtle marc = new Turtle( 200, 400, world);

    Turtle jenny = new Turtle( 200, 200, world);

    Turtle adam = new Turtle(600, 600, world);
    // // Add your code here
    yertle.setShellColor(Color.black);
    yertle.setPenColor(Color.green);
    marc.setShellColor(Color.blue);
    marc.setPenColor(Color.CYAN);
    jenny.setShellColor(Color.pink);
    jenny.setPenColor(Color.YELLOW);
    adam.setShellColor(Color.RED);
    adam.setPenColor(Color.ORANGE);
    System.out.println(jenny.getShellColor());

    yertle.setPenWidth(40);
    marc.setPenWidth(30);
    jenny.setPenWidth(15);
    adam.setPenWidth(55);
    

    yertle. polygon(5.0, 100);
    marc.circle(70); 
    adam.star(5, 110);
    jenny.heart(80);



    System.out.print(yertle.getName());
    System.out.print(marc.getName());
    System.out.print(jenny.getName());
    System.out.print(adam.getName());

  
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
