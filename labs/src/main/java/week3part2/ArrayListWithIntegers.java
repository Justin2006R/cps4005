/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3part2;

/**
 *
 * @author 2403851
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ArrayListWithIntegers {
   
    public ArrayListWithIntegers() {
         Scanner scanner = new Scanner(System.in);
         List<String> numbers = new ArrayList<>();
         Random rnd = new Random();
         
        numbers.add("1");
        numbers.add("2");
        numbers.add("3");
        
        int randomInt = rnd.nextInt(numbers.size());
        System.out.println(randomInt);
        
        for(int i = 0; i < numbers.size(); i++){
            numbers.remove(i);
            System.out.println("Removed " + i);
        }
        
        System.out.println("Input three numbers to add to the list");
        String num1 = scanner.nextLine();
        String num2 = scanner.nextLine();
        String num3 = scanner.nextLine();
        
        numbers.add(num1);
        numbers.add(num2);
        numbers.add(num3);
        
    }   
}

