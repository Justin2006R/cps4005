/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4;

/**
 *
 * @author 2403851
 */
abstract class Contractor extends Employee {
    
    public Contractor(String name, int employeeId){
        super(name, employeeId);
    }
    
    public abstract void work();
    
}
