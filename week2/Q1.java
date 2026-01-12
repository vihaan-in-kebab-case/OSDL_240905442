import java.util.Scanner;
class Room {
    Double tariff;
    Double serviceCharges;
    Integer numDays;

    public Room (int d, double t, double s) {
        //autoboxing
        numDays = d;
        tariff = t;
        serviceCharges = s;
    }

    public double calcBill() {
        //unboxing
        double tar = tariff;
        double ser = serviceCharges;
        int num = numDays;
        return (tar*num + ser);
    }

    public void displayBill() {
        System.out.println("Room Tariff/day: $" + tariff);
        System.out.println("Number of Days Stayed: " + numDays);
        System.out.println("Service Charge: $" + serviceCharges);
        System.out.println("Total Bill Amount: $" + calcBill());
    }
}

public class Q1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Room Tariff, Number of Days, & Service Charges:");
        double ta = in.nextDouble();
        int nu = in.nextInt();
        double se = in.nextDouble();
        in.close();

        Room r1 = new Room(nu, ta, se);
        r1.displayBill();
    }
}
