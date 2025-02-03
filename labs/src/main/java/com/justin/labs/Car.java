/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.justin.labs;

/**
 *
 * @author 2403851
 */
public class Car {
    private String colour;
    private String make;
    private String model;
    private int year;
    private int price;
    
    public Car(String colour, String make, String model, int year, int price){
        this.colour = colour;
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }
    
    public String getColour(){
        return colour;
    }
    
    public void setColour(String newColour){
        colour = newColour;
    }
    
    public String getMake(){
        return make;
    }
    
    public void setMake(String newMake){
        make = newMake;
    }
    
    public String getModel(){
        return model;
    }
    
    public void setModel(String newModel){
        model = newModel;
    }
    
    public int getYear(){
        return year;
    }
    
    public void setYear(int newYear){
        year = newYear;
    }
    
    public int getPrice(){
        return price;
    }
    
    public void setPrice(int newPrice){
        price = newPrice;
    }
    
    public void displayInfo(){
        System.out.println("Colour:" + colour);
        System.out.println("Make:" + make);
        System.out.println("Model:" + model);
        System.out.println("Year:" + year);
        System.out.println("Price:" + price);
    }
}


