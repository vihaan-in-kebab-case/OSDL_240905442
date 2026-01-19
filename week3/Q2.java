class OrderProcessingTasks extends Thread {
    private String orderId;
    private String custName;
    OrderProcessingTasks(String oi, String cn) {
        orderId = oi;
        custName = cn;
    }

    @Override
    public void run() {
        int i=1;
        String tasks[] = {"Order Confirmation", "Payment", "Shipping"};
        for (String t: tasks) {
            System.out.println(custName + " (" + orderId + ") - " + t + " Underway (Step " + i + ")" );
            i++;
            if(!t.equals("Confirmation")) {
                try {
                    Thread.sleep(t.equals("Payment") ? 250 : 750);
                } catch (InterruptedException e) {
                    System.out.println("Thread Interrupted...");
                }
            }
            System.out.println(custName + " (" + orderId + ") - " + t + " Completed");
        }
    }
}

public class Q2 {
    public static void main(String[] args) {
        OrderProcessingTasks c1 = new OrderProcessingTasks("#32923193", "Saksham");
        Thread t1 = new Thread(c1);
        t1.start();

        OrderProcessingTasks c2 = new OrderProcessingTasks("#45321633", "Prisha");
        Thread t2 = new Thread(c2);
        t2.start();

        OrderProcessingTasks c3 = new OrderProcessingTasks("#23435311", "Vihaan");
        Thread t3 = new Thread(c3);
        t3.start();
    }
}
