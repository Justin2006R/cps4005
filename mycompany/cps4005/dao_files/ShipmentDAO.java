/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cps4005.dao_files;

import com.mycompany.cps4005.database.database_connection;
import com.mycompany.cps4005.system_setup.shipment_tracking;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ShipmentDAO {
    public void addShipment(int orderId, String date, String destination) throws SQLException {
        String sql = "INSERT INTO shipments (order_id, ship_date, destination) VALUES (?, ?, ?)";
        try (Connection conn = database_connection.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, orderId);
            stmt.setString(2, date);
            stmt.setString(3, destination);
            stmt.executeUpdate();
        }
    }

    public List<shipment_tracking> getAllShipments() throws SQLException {
        String sql = "SELECT * FROM shipments";
        try (Connection conn = database_connection.getConnection(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            List<shipment_tracking> shipments = new ArrayList<>();
            while (rs.next()) {
                shipments.add(new shipment_tracking(
                    rs.getInt("shipment_id"),
                    rs.getInt("order_id"),
                    rs.getString("ship_date"),
                    rs.getString("destination")
                ));
            }
            return shipments;
        }
    }
}

