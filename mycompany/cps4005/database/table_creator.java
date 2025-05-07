/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cps4005.database;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class table_creator {
    public static void createTables() {
        String inventoryTable = """
            CREATE TABLE IF NOT EXISTS inventory (
                item_id INTEGER PRIMARY KEY AUTOINCREMENT,
                item_name TEXT NOT NULL,
                item_quantity INTEGER NOT NULL,
                item_location TEXT NOT NULL
            );
        """;

        String orderTable = """
            CREATE TABLE IF NOT EXISTS orders (
                order_id INTEGER PRIMARY KEY AUTOINCREMENT,
                item_id INTEGER,
                order_date TEXT,
                quantity INTEGER,
                FOREIGN KEY (item_id) REFERENCES inventory(item_id)
            );
        """;

        String shipmentTable = """
            CREATE TABLE IF NOT EXISTS shipments (
                shipment_id INTEGER PRIMARY KEY AUTOINCREMENT,
                order_id INTEGER,
                ship_date TEXT,
                destination TEXT,
                FOREIGN KEY (order_id) REFERENCES orders(order_id)
            );
        """;

        try (Connection conn = database_connection.getConnection(); Statement stmt = conn.createStatement()) {
            stmt.execute(inventoryTable);
            stmt.execute(orderTable);
            stmt.execute(shipmentTable);
            System.out.println("Database tables ensured.");
        } catch (SQLException e) {
            System.err.println("Error creating tables: " + e.getMessage());
        }
    }
}

