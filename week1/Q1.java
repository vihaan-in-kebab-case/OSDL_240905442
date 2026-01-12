import java.util.Scanner;
class Book {
    //private data members
    private int ID;
    private String title;
    private String author;
    private double price;
    private boolean isAvailable;

    //setter functions
    public void setId(int id) {
        ID = id;
    }

    public void setTitle(String t) {
        title = t;
    }

    public void setAuthor(String auth) {
        author = auth;
    }

    public void setPrice(double p) {
        Scanner sc = new Scanner(System.in);
        while(p < 0.0) {
            System.out.println("price cannot be negative! kindly enter valid price");
            p = sc.nextInt();
        }
        price = p;
        sc.close();
    }

    public void setAvailability(boolean avail) {
        isAvailable = avail;
    }

    //getter functions
    public int getId() {
        return ID;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public boolean getAvailability() {
        return isAvailable;
    }
}

public class Q1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Book b1 = new Book();
        System.out.println("enter book details: id, title, author, price, availability");
        b1.setId(in.nextInt());
        b1.setTitle(in.next());
        b1.setAuthor(in.next());
        b1.setPrice(in.nextDouble());
        b1.setAvailability(in.nextBoolean());

        System.out.println("ID: " + b1.getId());
        System.out.println("Title: " + b1.getTitle());
        System.out.println("Author: " + b1.getAuthor());
        System.out.println("Price: " + b1.getPrice());
        System.out.println("Availability Status: " + (b1.getAvailability() ? "Available" : "Not Available"));
        in.close();
    }
}
