/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2;

/**
 *
 * @author 2403851
 */
public class InheritanceExample {
    
    public static void main(String[] args){
        
        Circle myCircle =  new Circle("Red", 5);
        Rectangle myRectangle =  new Rectangle(3.5, 5, "Red");
        
        myCircle.draw();
        System.out.println(myCircle.calculateArea());
        
        myRectangle.draw();
        System.out.println(myRectangle.calculateArea());
        
    }
    
}
