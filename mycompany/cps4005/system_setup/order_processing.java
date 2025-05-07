/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cps4005.system_setup;

public class order_processing {
    public int orderId;
    public int itemId;
    public String orderDate;
    public int quantity;

    public order_processing(int orderId, int itemId, String orderDate, int quantity) {
        this.orderId = orderId;
        this.itemId = itemId;
        this.orderDate = orderDate;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return String.format("Order #%d: Item %d, Qty: %d on %s", orderId, itemId, quantity, orderDate);
    }
}

