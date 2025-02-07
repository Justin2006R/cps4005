/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2;

/**
 *
 * @author 2403851
 */
public class Shape {
    
    private String colour;
    
    public Shape(String colour){
        this.colour = colour;
    }
    
    public void draw(){
        System.out.println("Drawing Shape with the colour: " + colour);
    }
}
