/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cps4005.system_setup;

public class inventory_managment {
    public int itemId;
    public String itemName;
    public int quantity;
    public String location;

    public inventory_managment(int itemId, String itemName, int quantity, String location) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.quantity = quantity;
        this.location = location;
    }

    @Override
    public String toString() {
        return String.format("Item #%d - %s (%d units @ %s)", itemId, itemName, quantity, location);
    }
}

