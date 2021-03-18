/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trying;

import java.util.Scanner;

/**
 *
 * @author Matteo
 */
public class Circle extends Shape{
    public int diameter;
    Scanner sc = new Scanner(System.in);
    
    
    public double getDiameter(){
        return diameter;
    }

    @Override
    public double getArea() {
        double area = 0;
        area = Math.PI * ((getDiameter()/2)* (getDiameter()/2));
        return area;
    }

    @Override
    public double getPerimeter() {
        double circumference = 0;
        circumference = 2*Math.PI*(getDiameter()/2);
        return circumference;
    }
    
    public void setDiameter(){
        System.out.println("Input Diameter of Circle");
        diameter = sc.nextInt();
    }
    
}
