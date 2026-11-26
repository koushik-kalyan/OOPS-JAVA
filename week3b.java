interface ParkingCharge {
    double calculateCharge();
    void displayParkingDetails();
}

class VehicleParking {
    protected String vehicleNumber;
    protected String vehicleType;
    protected int parkingHours;

    VehicleParking(String vehicleNumber, String vehicleType, int parkingHours) {
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
        this.parkingHours = parkingHours;
    }
}

class TwoWheeler extends VehicleParking implements ParkingCharge {
    TwoWheeler(String number, int hours) {
        super(number, "Two Wheeler", hours);
    }

    @Override
    public double calculateCharge() {
        if (parkingHours <= 2)
            return parkingHours * 20;
        return (2 * 20) + (parkingHours - 2) * 10;
    }

    @Override
    public void displayParkingDetails() {
        System.out.println("Vehicle Number : " + vehicleNumber);
        System.out.println("Vehicle Type   : " + vehicleType);
        System.out.println("Parking Hours  : " + parkingHours);
        System.out.println("Total Charge   : Rs. " + calculateCharge());
    }
}

class FourWheeler extends VehicleParking implements ParkingCharge {
    FourWheeler(String number, int hours) {
        super(number, "Four Wheeler", hours);
    }

    @Override
    public double calculateCharge() {
        if (parkingHours <= 2)
            return parkingHours * 50;
        return (2 * 50) + (parkingHours - 2) * 30;
    }

    @Override
    public void displayParkingDetails() {
        System.out.println("Vehicle Number : " + vehicleNumber);
        System.out.println("Vehicle Type   : " + vehicleType);
        System.out.println("Parking Hours  : " + parkingHours);
        System.out.println("Total Charge   : Rs. " + calculateCharge());
    }
}

public class ParkingDemo {
    public static void main(String[] args) {
        ParkingCharge pc;  // interface reference

        pc = new TwoWheeler("KA01AB1234", 5);
        System.out.println("-- Two Wheeler --");
        pc.displayParkingDetails();

        System.out.println();

        pc = new FourWheeler("KA05MN9876", 4);
        System.out.println("-- Four Wheeler --");
        pc.displayParkingDetails();

        System.out.println("\nKoushik kalyan N\n1WN25CS112");
    }
}
