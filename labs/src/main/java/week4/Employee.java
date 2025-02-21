/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4;

/**
 *
 * @author 2403851
 */
abstract class Employee implements TrainingParticipant{
    
    private String name;
    private int employeeId;
    String trainingTop;
    
    public Employee(String name, int employeeId, String trainingTop){
        this.name = name;
        this.employeeId = employeeId;
        this.trainingTop = trainingTop;
        
    }
    
    @Override
    public void participateInTraining(String trainingTop){
        trainingTop = this.trainingTop;
    }
    
    public abstract void work();
    
    public void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Training Topic: " + trainingTop);
    }
    
}
