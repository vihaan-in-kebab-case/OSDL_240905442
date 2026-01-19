class RoomCleaning extends Thread {
    private String roomName;
    RoomCleaning(String rn) {
        roomName = rn;
    }

    @Override
    public void run() {
        String[] tasks = {"Sweeping", "Mopping", "Changing Bedsheets", "Bathroom", "Replacing Toiletries"};
        int i=1;
        for (String t: tasks) {
            System.out.println(roomName + " - " + t + " Underway (Step " + i + ")" );
            i++;
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread Interrupted...");
            }
        }
    }
}

class FoodDelivery implements Runnable {
    private String roomName;
    FoodDelivery(String rn) {
        roomName = rn;
    }

    @Override
    public void run() {
        String[] tasks = {"Gathering Ingredients", "Assigning Chef", "Preparing Order", "Assigning Waiter", "Delivery"};
        int i=1;
        for (String t: tasks) {
            System.out.println(roomName + " - " + t + " Underway (Step " + i + ")" );
            i++;
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread Interrupted...");
            }
        }
    }
}

class Maintainance extends Thread {
    private String roomName;
    Maintainance(String rn) {
        roomName = rn;
    }

    @Override
    public void run() {
        String[] tasks = {"Fixing Air Conditioner", "Fixing Lights", "Plumbing", "Fixing Chipped Paint", "Fixing Curtain/Blind Rails"};
        int i=1;
        for (String t: tasks) {
            System.out.println(roomName + " - " + t + " Underway (Step " + i + ")" );
            i++;
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread Interrupted...");
            }
        }
    }
}

public class Q1 {
    public static void main(String[] args) {
        RoomCleaning rc101 = new RoomCleaning("Room 101");
        Thread t1 = new Thread(rc101);
        t1.start();

        FoodDelivery fd101 = new FoodDelivery("Room 101");
        Thread t2 = new Thread(fd101);
        t2.start();

        Maintainance m101 = new Maintainance("Room 101");
        Thread t3 = new Thread(m101);
        t3.start();
    }
}
