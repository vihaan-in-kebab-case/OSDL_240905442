import java.util.Scanner;
class Room {
    int roomNumber;
    String roomType;
    double basePrice;

    Room() {
        roomNumber = 0;
        roomType = "";
        basePrice = 0.0;
    }

    Room(int rn, String rt) {
        roomNumber = rn;
        roomType = rt;
    }

    Room(int rn, String rt, double bp) {
        roomNumber = rn;
        roomType = rt;
        basePrice = bp;
    }

    void displayDetails() {
        System.out.println("Room Number: " + roomNumber);
        System.out.println("Room Type: " + roomType);
        System.out.println("Base Price: " + basePrice);
    }
}

class DeluxeRoom extends Room {
    boolean wifi;
    boolean breakfast;

    DeluxeRoom() {
        super();
        wifi = false;
        breakfast = false;
    }

    DeluxeRoom(int rn, String rt, boolean w, boolean b) {
        super(rn, rt);
        wifi = w;
        breakfast = b;
    }

    DeluxeRoom(int rn, String rt, double bp, boolean w, boolean b) {
        super(rn, rt, bp);
        wifi = w;
        breakfast = b;
    }
    
    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Complimentary WiFi: " +  (wifi ? "Included" : "Not Included"));
        System.out.println("Complimentary Breakfast: " +  (breakfast ? "Included" : "Not Included"));
    }
}

public class Q2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Room r1 = new Room();
        r1.displayDetails();

        Room r2 = new Room(in.nextInt(), in.next());
        r2.displayDetails();

        Room r3 = new Room(in.nextInt(), in.next(), in.nextDouble());
        r3.displayDetails();

        DeluxeRoom d1 = new DeluxeRoom();
        d1.displayDetails();

        DeluxeRoom d2 = new DeluxeRoom(in.nextInt(), in.next(), in.nextBoolean(), in.nextBoolean());
        d2.displayDetails();

        DeluxeRoom d3 = new DeluxeRoom(in.nextInt(), in.next(), in.nextDouble(), in.nextBoolean(), in.nextBoolean());
        d3.displayDetails();
        in.close();
    }
}
