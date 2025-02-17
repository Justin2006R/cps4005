/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4;

/**
 *
 * @author 2403851
 */
abstract class Employee{
    
    private String name;
    private int employeeId;
    
    public Employee(String name, int employeeId){
        this.name = name;
        this.employeeId = employeeId;
    }
    
    public abstract void work();
    
    public void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
    }
    
}
