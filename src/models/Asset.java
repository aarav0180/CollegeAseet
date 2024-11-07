package models;

public class Asset {
    private String assetID;
    private String name;
    private String type;
    private String location;
    private String status;
    private double value;
    private String purchaseDate;

    public Asset(String assetID, String name, String type, String location, String status, double value, String purchaseDate) {
        this.assetID = assetID;
        this.name = name;
        this.type = type;
        this.location = location;
        this.status = status;
        this.value = value;
        this.purchaseDate = purchaseDate;
    }

    public void assignToDepartment(String department) {
        this.location = department;
    }

    public void markForMaintenance() {
        this.status = "Maintenance";
    }

    public void updateLocation(String newLocation) {
        this.location = newLocation;
    }

    public String getStatus() { return status; }

    @Override
    public String toString() {
        return "Asset ID: " + assetID + ", Name: " + name + ", Location: " + location + ", Status: " + status;
    }
}

