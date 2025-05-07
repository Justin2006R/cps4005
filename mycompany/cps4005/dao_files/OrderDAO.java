/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cps4005.dao_files;

import com.mycompany.cps4005.database.database_connection;
import com.mycompany.cps4005.system_setup.order_processing;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class OrderDAO {
    public void addOrder(int itemId, String date, int qty) throws SQLException {
        String sql = "INSERT INTO orders (item_id, order_date, quantity) VALUES (?, ?, ?)";
        try (Connection conn = database_connection.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, itemId);
            stmt.setString(2, date);
            stmt.setInt(3, qty);
            stmt.executeUpdate();
        }
    }

    public List<order_processing> getAllOrders() throws SQLException {
        String sql = "SELECT * FROM orders";
        try (Connection conn = database_connection.getConnection(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            List<order_processing> orders = new ArrayList<>();
            while (rs.next()) {
                orders.add(new order_processing(
                    rs.getInt("order_id"),
                    rs.getInt("item_id"),
                    rs.getString("order_date"),
                    rs.getInt("quantity")
                ));
            }
            return orders;
        }
    }
}

