/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3part2;

/**
 *
 * @author 2403851
 */

import java.util.ArrayList;
import java.util.List;

public class PolymorphicArrayList {
    
    public static void Main(String[] args){
        List<Animal> animals = new ArrayList<>();
        
        animals.add(new Cat("Fluffy"));
        animals.add(new Dog("Bruce"));
        
        for(int i = 0; i < animals.size(); i++){
            System.out.println(animals.get(i));
        }      
    }
}
