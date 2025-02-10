/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3;

/**
 *
 * @author 2403851
 */
public class Drawing {
    public void drawShape(Shape shape) {
        shape.draw();
    }
    
    public double calculateArea(Shape shape){
        return shape.area();
    }
    
    public void describeShape(Shape shape){
        System.out.println(shape.getDescription());
    }
    
    public void applyColor(Shape shape, String colour){
        
        if (shape instanceof ColoredCircle){
            ColoredCircle coloredCircle = (ColoredCircle) shape;
            coloredCircle.setColour(colour);
            System.out.println("Set colour " + colour);
        }
        else{
            System.out.println("Color can onlybe applied to ColouredCircle");
        }
        
    }
}
