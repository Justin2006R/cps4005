/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.justin.labs;

/**
 *
 * @author 2403851
 */

import java.util.ArrayList;
import java.util.List;

public class carsList {
    private List<Car> carList;
    
    public carsList(){
        carList = new ArrayList<>();
    }
    
    public void addCar(Car car){
        carList.add(car);
    }
    
    public void removeCar(Car car){
        carList.remove(car);
    }
    
    public void displayAllCars(){
        System.out.println("Cars: ");
        for(int i = 0; i < carList.size(); i++){
            carList.get(i).displayInfo();
            System.out.println("--------");
        }
    }
    
}
