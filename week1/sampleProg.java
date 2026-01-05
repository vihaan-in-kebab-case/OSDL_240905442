class Car {
    String color;
    int weight;

    void drive() {
        System.out.println("my car is of " + color + " color");
        System.out.println("my car weighs " + weight + " kgs");
    }
}
public class sampleProg {
        public static void main(String[] args)
        {
            Car myCar = new Car();
            myCar.color = "Silver";
            myCar.weight = 1200;
            myCar.drive();
        }
}
