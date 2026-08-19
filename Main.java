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
    yertle.setName("Yertle");
    marc.setName("Marc");
    jenny.setName("Jenny"); 
    adam.setName("Adam");
    yertle.setHeight(30);
    yertle.setWidth(25);
    marc.setHeight(45);
    marc.setWidth(38);
    jenny.setHeight(20);
    jenny.setWidth(17);
    adam.setHeight(55);
    adam.setWidth(46);
  
    yertle.setShellColor(Color.black);
    yertle.setPenColor(Color.green);
    marc.setShellColor(Color.blue);
    marc.setPenColor(Color.CYAN);
    jenny.setShellColor(Color.pink);
    jenny.setPenColor(Color.YELLOW);
    adam.setShellColor(Color.RED);
    adam.setPenColor(Color.ORANGE);
    

    yertle.setPenWidth(6);
    marc.setPenWidth(4);
    jenny.setPenWidth(3);
    adam.setPenWidth(5);
    

    yertle.polygon(5.0, 100);
    marc.circle(70); 
    adam.star(5, 110);
    jenny.heart(80);



    Color yertleColor = yertle.getShellColor();
    System.out.println("Name: " + yertle.getName());
    System.out.println("Color (RGB): (" + yertleColor.getRed() + ", " + yertleColor.getGreen() + ", " + yertleColor.getBlue() + ")");
    System.out.println("Shape drawn: pentagon");
    System.out.println("Distance from (0,0): ", yertle.getDistance(0, 0));
    System.out.println();

    Color marcColor = marc.getShellColor();
    System.out.println("Name: " + marc.getName());
    System.out.println("Color (RGB): (" + marcColor.getRed() + ", " + marcColor.getGreen() + ", " + marcColor.getBlue() + ")");
    System.out.println("Shape drawn: circle");
    System.out.println("Distance from (0,0): ", marc.getDistance(0, 0));
    System.out.println();

    Color jennyColor = jenny.getShellColor();
    System.out.println("Name: " + jenny.getName());
    System.out.println("Color (RGB): (" + jennyColor.getRed() + ", " + jennyColor.getGreen() + ", " + jennyColor.getBlue() + ")");
    System.out.println("Shape drawn: heart");
    System.out.println("Distance from (0,0): ", jenny.getDistance(0, 0));
    System.out.println();

    Color adamColor = adam.getShellColor();
    System.out.println("Name: " + adam.getName());
    System.out.println("Color (RGB): (" + adamColor.getRed() + ", " + adamColor.getGreen() + ", " + adamColor.getBlue() + ")");
    System.out.println("Shape drawn: star");
    System.out.println("Distance from (0,0): ", adam.getDistance(0, 0));
    System.out.println();

  
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
