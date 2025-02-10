/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3;

/**
 *
 * @author 2403851
 */
public class Triangle extends Shape {
    
    private double base;
    private double height;
    
    public Triangle(double base, double height){
        this.base = base;
        this.height = height;             
    }
    
    @Override
    public void draw(){
        System.out.println("This is a triangle");
    }
    
    @Override
    public double area(){
        return 0.5 * base * height;
    }
}
