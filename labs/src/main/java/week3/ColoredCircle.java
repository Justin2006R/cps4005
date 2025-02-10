/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3;

/**
 *
 * @author 2403851
 */
public class ColoredCircle extends Circle {
    
    private String colour;
    
    public ColoredCircle(double radius, String colour){
        super(radius);
        this.colour = colour;
    }
    
    @Override
    public String getDescription(){
        return "This is a " + colour + " circle";
    }
    
    public void setColour(String colour){
        this.colour = colour;
    }
    
}
