class Student {
    private int id;
    private String name;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

public class studentSample {
    public static void main(String[] args) {
        Student s = new Student();
        s.setId(49);
        s.setName("vihaan");
        System.out.println("ID: " + s.getId());
        System.out.println("Name: " + s.getName());
    }
}
