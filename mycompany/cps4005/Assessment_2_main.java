/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cps4005;


import com.mycompany.cps4005.dao_files.InventoryDAO;
import com.mycompany.cps4005.dao_files.OrderDAO;
import com.mycompany.cps4005.dao_files.ShipmentDAO;
import com.mycompany.cps4005.database.table_creator;

import java.util.Scanner;

public class Assessment_2_main {
    public static void main(String[] args) {
        table_creator.createTables();

        Scanner sc = new Scanner(System.in);
        InventoryDAO inventoryDAO = new InventoryDAO();
        OrderDAO orderDAO = new OrderDAO();
        ShipmentDAO shipmentDAO = new ShipmentDAO();

        while (true) {
            System.out.println("""
                1. View inventory management
                2. Add item to inventory
                3. View processing orders
                4. Add an order
                5. View shipments
                6. Add shipment
                0. Exit
                """);

            System.out.print("Choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); 

            try {
                switch (choice) {
                    case 1 -> inventoryDAO.getAllItems().forEach(System.out::println);
                    case 2 -> {
                        System.out.print("Name: ");
                        String name = sc.nextLine();
                        System.out.print("Amount: ");
                        int qty = sc.nextInt(); sc.nextLine();
                        System.out.print("Location: ");
                        String loc = sc.nextLine();
                        inventoryDAO.addItem(name, qty, loc);
                    }
                    case 3 -> orderDAO.getAllOrders().forEach(System.out::println);
                    case 4 -> {
                        System.out.print("ItemID: ");
                        int itemId = sc.nextInt(); sc.nextLine();
                        System.out.print("Order date: ");
                        String date = sc.nextLine();
                        System.out.print("Amount: ");
                        int qty = sc.nextInt(); sc.nextLine();
                        orderDAO.addOrder(itemId, date, qty);
                    }
                    case 5 -> shipmentDAO.getAllShipments().forEach(System.out::println);
                    case 6 -> {
                        System.out.print("OrderID: ");
                        int orderId = sc.nextInt(); sc.nextLine();
                        System.out.print("Shipment date: ");
                        String shipDate = sc.nextLine();
                        System.out.print("Location: ");
                        String destination = sc.nextLine();
                        shipmentDAO.addShipment(orderId, shipDate, destination);
                    }
                    default -> System.out.println("Pick again");
                }
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
    }
}

