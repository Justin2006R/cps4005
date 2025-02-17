/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4;

/**
 *
 * @author 2403851
 */
public class Manager extends Employee {
    
    public Manager(String name, int employeeId){
        super(name, employeeId);
    }
    
    @Override
    public void work(){
        System.out.println("Working....");
    }
    
}
