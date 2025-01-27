/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.justin.labs;

/**
 *
 * @author 2403851
 */

import java.util.Scanner;

public class Labs {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        double age = 18.5;
        
        System.out.print("Enter your name: ");
                String userName = scanner.nextLine();
        
        System.out.println("Age: " + age);
        System.out.println("Hello, " + userName + "!");
        
        System.out.println(calculations());
    }
    
    public static boolean calculations()
    {
        int x = 5, y = 8;
        
        boolean isEqual = (x == y);
        
        return isEqual;
    }
}
