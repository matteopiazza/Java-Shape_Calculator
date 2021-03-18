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
public class Square extends Shape{
    Scanner sc = new Scanner(System.in);
    int length;
    
    @Override
    public double getArea() {
        double area = 0;
        area = (getLength()*getLength());
        return area;
    }

    @Override
    public double getPerimeter() {
        double perimeter = 0;
        perimeter = (getLength() * 4);
        return perimeter;
    }
    
    public void setLength(){
        System.out.println("Input length of square");
        length = sc.nextInt();
    }
    
    public double getLength() {
        return length;
    }
}
