/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cps4005.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class database_connection {
    private static final String URL = "jdbc:sqlite:warehouse.db";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL);
    }
}

