/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trying;

import java.text.DecimalFormat;
import java.util.Scanner;
import static javafx.application.Platform.exit;

/**
 *
 * @author Matteo
 */
public class Shape implements Measure{
    DecimalFormat df = new DecimalFormat("#.##");
    public double length;
    public double width;
    public int shapeChoice;
    Scanner sc = new Scanner(System.in);
    
    public void setLength(double l){
        length = l;
    }
    
    public double getLength(){
        return length;
    }
    
    public void setWidth(double w){
        width = w;
    }
    
    public double getWidth(){
        return width;
    }
    
    public void enterShape(){
      System.out.println("What shape would you like to calculate?");
      System.out.println("Enter 1 for square");
      System.out.println("Enter 2 for circle");
      System.out.println("Enter 3 for triangle");
      System.out.println("Enter 9 to exit");
      shapeChoice = sc.nextInt();
      
      if(shapeChoice == 1){
          Square s1 = new Square();
          s1.setLength();
          System.out.println("Area: "+s1.getArea());
          System.out.println("Perimeter: "+ s1.getPerimeter());
          enterShape();
      }else if(shapeChoice == 2){
          Circle c1 = new Circle();
          c1.setDiameter();
          System.out.println("Area: "+c1.getArea());
          System.out.println("Circumference: "+ c1.getPerimeter());
          enterShape();
      }else if(shapeChoice == 3){
          Triangle t1 = new Triangle();
          t1.setDiameter();
          t1.setHeight();
          System.out.println("Area: "+t1.getArea());
          enterShape();
      }else if(shapeChoice == 9){
          exit();
      }else{
          System.out.println("Invalid choice");
          enterShape();
      }
      
    }

    @Override
    public double getArea() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public double getPerimeter() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}

 

class ShapeTest{
    public static void main(String[] args){
        Shape s = new Shape();
        s.enterShape();
    }

    private static double getLength(Scanner sc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}