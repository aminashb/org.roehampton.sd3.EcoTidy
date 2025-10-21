package org.roehampton.sd3.ecoTidy;

public class DeviceModel{
    String modelId;
    String name;
    double pricePerDay;

    public DeviceModel(String modelId, String name, double pricePerDay){
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

    public double getPricePerDay(){
        return pricePerDay;
    }

    public void setModelId(String modelId){
        this.modelId = modelId;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setPricePerDay(float pricePerDay){
        this.pricePerDay = pricePerDay;
    }
}
