/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2;

/**
 *
 * @author 2403851
 */
public class Rectangle extends Shape {
    
    private double length;
    private double width;
    
    public Rectangle(double length, double width, String color){
        
        super(color);
        this.length = length;
        this.width = width;
        
    }
    
    public double calculateArea(){
        
        System.out.println("Calculating Area");
        return length*width;
        
    }
   
}
