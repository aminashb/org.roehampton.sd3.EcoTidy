package org.roehampton.sd3.ecoTidy;

public class DeviceModel {
    String modelId;
    String name;
    int pricePerDay;

    public DeviceModel(String modelId, String name, int pricePerDay){
        this.modelId = modelId;
        this.name = name;
        this.pricePerDay = pricePerDay;
    }

    public String getModelId(){
        return modelId;
    }

    public String getName(){
        return name;
    }

    public int getPricePerDay(){
        return pricePerDay;
    }

    public void setModelId(String modelId){
        this.modelId = modelId;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setPricePerDay(int pricePerDay){
        this.pricePerDay = pricePerDay;
    }

    public void displayInfo() {
        System.out.println(modelId + ", " + name + ", £" + pricePerDay + "/ per day");
    }
}
