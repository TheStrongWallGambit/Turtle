import java.util.*;
import java.awt.*;

/**
 * Class that represents a turtle which is similar to a Logo turtle.
 * This class inherts from SimpleTurtle and is for students
 * to add methods to.
 *
 * Copyright Georgia Institute of Technology 2004
 * @author Barb Ericson ericson@cc.gatech.edu
 */
public class Turtle extends SimpleTurtle
{
  ////////////////// constructors ///////////////////////
  
  /** Constructor that takes the x and y and a picture to
   * draw on
   * @param x the starting x position
   * @param y the starting y position
   * @param picture the picture to draw on
   */
  public Turtle (int x, int y, Picture picture) 
  {
    // let the parent constructor handle it
    super(x,y,picture);
  }
  
  /** Constructor that takes the x and y and a model
   * display to draw it on
   * @param x the starting x position
   * @param y the starting y position
   * @param modelDisplayer the thing that displays the model
   */
  public Turtle (int x, int y, 
                 ModelDisplay modelDisplayer) 
  {
    // let the parent constructor handle it
    super(x,y,modelDisplayer);
  }
  
  /** Constructor that takes the model display
   * @param modelDisplay the thing that displays the model
   */
  public Turtle (ModelDisplay modelDisplay) 
  {
    // let the parent constructor handle it
    super(modelDisplay);
  }
  
  /**
   * Constructor that takes a picture to draw on
   * @param p the picture to draw on
   */
  public Turtle (Picture p)
  {
    // let the parent constructor handle it
    super(p);
  }  
  
  /////////////////// methods ///////////////////////


//   public static void main(String[] args)
//   {
//     World earth = new World();
//     Turtle t1 = new Turtle(earth);
//     t1.forward();
//   }
public void star(int points, int size){
    double angle =720.0/points;
    for (int i =0; i<points; i++){
      this.forward(size);
      this.turn(angle);
    }
  }
  public void circle(int radius){
    int side = (int) Math.round((2*Math.PI*radius)/36);
    for (int i =0; i<36; i++){
      this.forward(side);
      this.turn(10);
    }
  }

  public void arc(int chord, int degrees) {
    for (int i = 0; i < degrees / 5; i++) {
      this.forward(chord);
      this.turn(5); 
      }
  }

  public void heart(int size) {
    int chord = Math.max(2, (int) Math.round(size / 18.0));
    int leg = chord * 18;              // must derive leg FROM chord
    this.turn(90);
    this.turn(-140);
    this.forward(leg);
    arc(chord, 200);
    this.turn(-120);
    arc(chord, 200);
    this.forward(leg);

  }
} // this } is the end of class Turtle, put all new methods before this
