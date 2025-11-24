package org.roehampton.sd3.ecoTidy;

import java.util.ArrayList;
import java.util.List;

public class Customer extends User {
    String address;
    String paymentMethod;
    List<Order> orders;
    List<Device> devices;


    public Customer(String name, String userId, String email, String phoneNum, String address, String paymentMethod){
        super(name, userId, email, phoneNum);
        this.address = address;
        this.paymentMethod = paymentMethod;
        orders = new ArrayList<>();
        devices = new ArrayList<>();
    }

    public String getAddress(){
        return address;
    }

    public String getPaymentMethod(){
        return paymentMethod;
    }

    public List<Order> getOrders(){
        return orders;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public void setPaymentMethod(String paymentMethod){
        this.paymentMethod = paymentMethod;
    }

    public void addDevice(Device device){
        devices.add(device);
    }

    public void setOrders(List<Order> orders){
        this.orders = orders;
    }

    public List<Device> getDevices(){
        return devices;
    }
//    @Override
//    public void register();
//
//    @Override
//    public void login();
//
//    @Override
//    public void logout();
//
    public void placeOrder(int days){
        Order order = new Order(devices);
        order.confirmOrder(devices, days);
        order.processPayment();
        order.generateInvoice();
    }

    public void returnDevice(Device device){
        device.returnDevice();
    }
//    public void rateService();

    public void  displayInfo(){
        System.out.println(super.getName() + ", " + super.getEmail() + ", " + super.getUserId() + ", " + super.getPhoneNum() + ", " + address + ", " + paymentMethod + ", orders:" + orders.size());
    }
}
