import java.util.Scanner;
class Room {
    int roomNumber;
    double baseTariff;
    double calculateTariff() {
        return baseTariff;   
    }
}

class StandardRoom extends Room {
    @Override
    double calculateTariff() {
        return baseTariff;
    }
}

class LuxuryRoom extends Room {
    @Override
    double calculateTariff() {
        return baseTariff;
    }
}

public class Q3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Room r1  = new Room();
        StandardRoom sr1 = new StandardRoom();
        LuxuryRoom lr1 = new LuxuryRoom();
    }
}
