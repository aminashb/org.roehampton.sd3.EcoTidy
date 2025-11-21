package org.roehampton.sd3.ecoTidy;


import java.util.ArrayList;
import java.util.List;

public class InventoryManager {
    private List<Device> availableDevices;
    private List<Device> unavailableDevices;

    public InventoryManager() {
        availableDevices = new ArrayList<>();
        unavailableDevices = new ArrayList<>();
    }

    public void addDevice(Device item) {
        availableDevices.add(item);
    }

    public void getAvailableDevices() {
        System.out.println("Available Devices:");
        for (Device item : availableDevices) {
            String name = item.model.getName();
            System.out.println(name);
        }
    }

    public void markAsUnavailable(Device item) {
        availableDevices.remove(item);
        unavailableDevices.add(item);
    }

    public void markAsAvailable(Device item) {
        unavailableDevices.remove(item);
        availableDevices.add(item);
    }
}
