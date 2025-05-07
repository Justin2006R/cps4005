/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cps4005.dao_files;

import com.mycompany.cps4005.system_setup.inventory_managment;
import com.mycompany.cps4005.database.database_connection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class InventoryDAO {
    public void addItem(String name, int qty, String location) throws SQLException {
        String sql = "INSERT INTO inventory (item_name, item_quantity, item_location) VALUES (?, ?, ?)";
        try (Connection conn = database_connection.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, name);
            stmt.setInt(2, qty);
            stmt.setString(3, location);
            stmt.executeUpdate();
        }
    }

    public List<inventory_managment> getAllItems() throws SQLException {
        String sql = "SELECT * FROM inventory";
        try (Connection conn = database_connection.getConnection(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            List<inventory_managment> items = new ArrayList<>();
            while (rs.next()) {
                items.add(new inventory_managment(
                    rs.getInt("item_id"),
                    rs.getString("item_name"),
                    rs.getInt("item_quantity"),
                    rs.getString("item_location")
                ));
            }
            return items;
        }
    }
}

