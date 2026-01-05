import java.util.Scanner;
abstract class Room {
    int roomNumber;
    double baseTariff;
    abstract double calculateTariff();
    void displayDetails() {
        System.out.println("Room Number: " + roomNumber);
        System.out.println("Tariff: " + calculateTariff());
    }
}

interface Amenities {
    void provideWiFi();
    void provideBreakfast();
}

class StandardRoom extends Room implements Amenities {
}

class LuxuryRoom extends Room implements Amenities {
}

public class Q4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    }
}
