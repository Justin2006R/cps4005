/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4;

/**
 *
 * @author 2403851
 */
public class Engineer extends Employee implements TrainingParticipant{
    
    String name;
    
    public Engineer(String name, int employeeId, String trainingTop){
        super(name, employeeId, trainingTop);
        this.name = name;
    }
    
    @Override
    public void work(){
        System.out.println("Working....");
    }
    
    @Override
    public void participateInTraining(String trainingTop){
        System.out.println(name + "is training on " + trainingTop);
    }
    
}
