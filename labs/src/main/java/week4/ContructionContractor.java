/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4;

/**
 *
 * @author 2403851
 */
public class ContructionContractor extends Contractor {
    
    public ContructionContractor(String name, int employeeId, String trainingTop){
        super(name, employeeId, trainingTop);
    }
    
    @Override
    public void work(){
        System.out.println("Working....");
    }
    
}
