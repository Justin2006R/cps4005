/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.justin.labs;

/**
 *
 * @author 2403851
 */

public class Labs {

    public static void main(String[] args) {        
        Car car1 = new Car("Red", "Small", "Mini", 2025, 5000);
        
        car1.displayInfo();
        
        carsList listt = new carsList();
        listt.addCar(car1);
        listt.displayAllCars();
    }
    
    public static boolean calculations()
    {
        int x = 5, y = 8;
        
        boolean isEqual = (x == y);
        
        return isEqual;
    }
}
