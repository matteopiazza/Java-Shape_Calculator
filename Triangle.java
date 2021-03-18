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
public class Triangle extends Shape{
    public int base;
    public int height;
    Scanner sc = new Scanner(System.in);
    
    
    public double getDiameter(){
        return base;
    }
    
    public double getHeight(){
        return height;
    }
    
    @Override
    public double getArea() {
        double area = 0;
        area = ((getDiameter()*getHeight())/2);
        return area;
    }

    @Override
    public double getPerimeter() {
        double circumference = 0;
        circumference = 2*Math.PI*(getDiameter()/2);
        return circumference;
    }
    
    public void setDiameter(){
        System.out.println("Input base of Triangle");
        base = sc.nextInt();
    }

    public void setHeight() {
       System.out.println("Input height of Triangle");
       height = sc.nextInt();    
    }
}
