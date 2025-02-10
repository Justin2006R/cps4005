/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3;

/**
 *
 * @author 2403851
 */

public class Main {
    public static void main(String[] args) {
        Drawing drawing = new Drawing();
        
        Shape circle = new Circle(5.0);
        Shape square = new Square(4.0);
        Shape triangle = new Triangle(5, 5);
        Shape colCircle = new ColoredCircle(5, "Red");
        
        drawing.drawShape(circle);  
        drawing.drawShape(square);  
        drawing.drawShape(triangle); 
        
        System.out.println("Area of circle: " + drawing.calculateArea(circle));   
        System.out.println("Area of square: " + drawing.calculateArea(square));    
        System.out.println("Area of triangle: " + drawing.calculateArea(triangle)); 
        
        drawing.describeShape(circle);  
        drawing.describeShape(square); 
        drawing.describeShape(triangle); 
        drawing.describeShape(colCircle);
        
        drawing.applyColor(circle, "Orange");
        drawing.applyColor(colCircle, "Green");
    }
}
