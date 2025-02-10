/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3;

/**
 *
 * @author 2403851
 */
public class Square extends Shape {
    
    private double side;
    
    public Square(double side){
        this.side = side;
    }
    
     @Override
    public void draw() {
        System.out.println("Drawing a square");
    }
    
    @Override
    public double area(){
        return side * side;
    }
}
