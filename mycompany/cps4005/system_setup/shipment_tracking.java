/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cps4005.system_setup;

public class shipment_tracking {
    public int shipmentId;
    public int orderId;
    public String shipDate;
    public String destination;

    public shipment_tracking(int shipmentId, int orderId, String shipDate, String destination) {
        this.shipmentId = shipmentId;
        this.orderId = orderId;
        this.shipDate = shipDate;
        this.destination = destination;
    }

    @Override
    public String toString() {
        return String.format("Shipment #%d: Order %d to %s on %s", shipmentId, orderId, destination, shipDate);
    }
}
