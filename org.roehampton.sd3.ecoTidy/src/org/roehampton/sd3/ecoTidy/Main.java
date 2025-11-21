import org.roehampton.sd3.ecoTidy.*;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    DeviceModel vacuumCleaner = new DeviceModel("SV53-A", "Dyson V16", 18);
    DeviceModel carpetCleaner = new DeviceModel("SV55-B", "Dyson V09", 12);
    vacuumCleaner.displayInfo();
    carpetCleaner.displayInfo();

    InventoryManager inventory = new InventoryManager();

    Device v1 = new Device(101, 202301001, true, vacuumCleaner, inventory);
    Device v2 = new Device(102, 202301002, true, vacuumCleaner, inventory);
    Device v3 = new Device(103, 202301003, true, carpetCleaner, inventory);
    v1.displayInfo();
    v2.displayInfo();
    v3.displayInfo();

    inventory.getAvailableDevices();


    Customer c1 = new Customer("Amina Shah", "C001", "amina.shah@example.com", "+44 7123 456789", "45 Greenfield Road, London, UK", "Credit Card");
    Customer c2 = new Customer("Liam Carter",
            "C002",
            "liam.carter@example.com",
            "+44 7901 234567",
            "12 Oakwood Avenue, Manchester, UK",
            "PayPal");
    Customer c3 = new Customer("Sofia Nguyen",
            "C003",
            "sofia.nguyen@example.com",
            "+44 7702 998877",
            "89 Riverbank Street, Birmingham, UK",
            "Debit Card");
    c1.displayInfo();
    c2.displayInfo();
    c3.displayInfo();

    c1.addDevice(v1);
    c1.placeOrder(3);
    inventory.getAvailableDevices();

}
