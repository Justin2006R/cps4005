/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2;

/**
 *
 * @author 2403851
 */
public class Circle extends Shape{
    
    double radius;
    
    public Circle(String colour, double radius){
        super(colour);
        this.radius = radius;   
    }
    
    public double calculateArea(){
        
        System.out.println("Calculating Area");
        return Math.PI* Math.pow(radius, 2);
        
    }
}
