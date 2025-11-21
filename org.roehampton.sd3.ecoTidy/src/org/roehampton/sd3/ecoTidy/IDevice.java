package org.roehampton.sd3.ecoTidy;

public interface IDevice {
    public void rentOut();
    public void returnDevice();
    public int calculateRentalPrice(int days);
}
