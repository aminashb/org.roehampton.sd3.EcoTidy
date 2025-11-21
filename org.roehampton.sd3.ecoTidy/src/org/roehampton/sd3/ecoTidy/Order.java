package org.roehampton.sd3.ecoTidy;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Order {
//    String orderId;
//    String orderDate;
    List<Device> devices;
    List<Integer> rentalPrices;
//    String status;
    int totalCost;

    public Order(List<Device> devices) {
//        orderId = orderId;
//        this.orderDate = orderDate;
//        this.status = status;
        this.devices = devices;
        rentalPrices = new ArrayList<>();
    }

//    public String getOrderId(){
//        return orderId;
//    }
//
//    public String getOrderDate(){
//        return orderDate;
//    }

//    public String getStatus(){
//        return status;
//    }

    public double getTotalCost(){
        return totalCost;
    }

//    public void setOrderId(String orderId){
//        this.orderId = orderId;
//    }
//
//    public void setOrderDate(String orderDate){
//        this.orderDate = orderDate;
//    }

//    public void setStatus(String status){
//        this.status = status;
//    }

    public void setTotalCost(int totalCost){
        this.totalCost = totalCost;
    }

    public void confirmOrder(List<Device> devices, int days){
        for (int i = 0; i < devices.size(); i++) {
            Device device = devices.get(i);
            String status = device.getStatus();
            if (Objects.equals(status, "Not available")) {
                devices.remove(device);
            }else if (Objects.equals(status, "Available")) {
                device.rentOut();
            }
        }
        for (Device device : devices) {
            int price = device.calculateRentalPrice(days);
            rentalPrices.add(price);
            System.out.println(device.model.getName() + " £" + price);
        }
    }
    public void processPayment(){
        for (int price : rentalPrices) {
            totalCost += price;
        }
    }
    public void cancelOrder(){

    }
    public void generateInvoice(){

    }

//    public void displayInfo(){
//        System.out.println(orderId + ", " + orderDate + ", " + totalCost);
//    }
}
