enum Apple {
    Jonathan, GoldenDel, RedDel, Winesap, Cortland
}

public class enumExample {
    public static void main(String[] args) {
        Apple ap;
        System.out.println("Here are all Apple constants:");
        Apple allApples[] = Apple.values();
        for(Apple a: allApples)
            System.out.println(a);
        
        System.out.println();
        ap = Apple.valueOf("Winesap");
        System.out.println("ap contains: " + ap);
    }
}