import java.util.Scanner;

enum RoomType {
    Standard (2000.50), Deluxe (3500.75), Suite (5000.25);

    final private double pricePerNight;
    private int numDays;
    private double serviceCharges;

    RoomType(double ppn) {
        this.pricePerNight = ppn;
    }

    public void setDetails(int d, double ser) {
        numDays = d;
        serviceCharges = ser;
    }

    public double calculateBill() {
        return (pricePerNight * numDays + serviceCharges);
    }

    public void displayBill() {
        System.out.println("Room Type: " + this);
        System.out.println("Room Tariff/day: $" + pricePerNight);
        System.out.println("Number of Days Stayed: " + numDays);
        System.out.println("Service Charge: $" + serviceCharges);
        System.out.println("Total Bill Amount: $" + calculateBill());
    }
}

public class Q2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Number of Days Stayed and Service Charges:");
        int n = in.nextInt();
        double s = in.nextDouble();
        in.close();

        RoomType r1 = RoomType.Deluxe;
        r1.setDetails(n, s);
        r1.displayBill();
        System.out.println();

        RoomType r2 = RoomType.Suite;
        r2.setDetails(n, s);
        r2.displayBill();
        System.out.println();

        RoomType r3 = RoomType.Standard;
        r3.setDetails(n, s);
        r3.displayBill();
        System.out.println();
    }
}
