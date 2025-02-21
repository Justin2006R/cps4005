/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4;

/**
 *
 * @author 2403851
 */
public class Main {
    public static void main(String[] args) {
        Employee manager = new Manager("Jess", 101, "Topic 1");
        Employee engineer = new Engineer("Joe", 102, "Topic 2");

        manager.work();
        engineer.work();
             
        manager.displayInfo();
        engineer.displayInfo();
        
        Contractor softwareCon = new SoftwareContractor("Jill", 201, "Topic 1");
        Contractor constructionCon = new ContructionContractor("Jack", 202, "Topic 2");
        
        softwareCon.work();
        constructionCon.work();
    }
}