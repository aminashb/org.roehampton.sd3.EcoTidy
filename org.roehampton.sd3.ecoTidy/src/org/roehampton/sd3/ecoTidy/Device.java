package org.roehampton.sd3.ecoTidy;

public class Device implements IDevice{
    int itemId;
    int serialNumber;
    Boolean status;
    DeviceModel model;
    InventoryManager inventory;
    int rentalPrice;

    public Device(int itemId, int serialNumber, Boolean status, DeviceModel model,  InventoryManager inventory) {
        this.itemId = itemId;
        this.serialNumber = serialNumber;
        this.status = status;
        this.inventory = inventory;
        inventory.addDevice(this);
        this.model = model;
    }

    public int getItemId(){
        return itemId;
    }

    public int getSerialNumber(){
        return serialNumber;
    }

    public String getStatus(){
        if (status){
            return "Available";
        }
        else return "Not available";
    }

    public DeviceModel getModel(){
        return model;
    }

    public void setItemId(int itemId){
        this.itemId = itemId;
    }

    public void setSerialNumber(int serialNumber){
        this.serialNumber = serialNumber;
    }

    public void setStatus(Boolean status){
        this.status = status;
    }

    public void setModel(DeviceModel model){
        this.model = model;
    }

    @Override
    public void rentOut(){
        setStatus(false);
        inventory.markAsUnavailable(this);
    }
    public void returnDevice(){
        setStatus(true);
        inventory.markAsAvailable(this);
    };
    public int calculateRentalPrice(int days){
        rentalPrice = model.pricePerDay * days;
        return rentalPrice;
    }

    public void displayInfo() {
        System.out.println(model.getName() + ", " + serialNumber + ", " + status + ", " + rentalPrice);
    }
}
