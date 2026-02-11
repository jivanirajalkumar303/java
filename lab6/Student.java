// Create class Student with attributes (name: String, roll_no:int, SPI:double, 
// course: String). Implement getter() and setter() method to assign data for 3 
// students and display it.[A] 


class Std {

    String name;
    int roll;
    double spi;
    String cours;

    void get(String n, int r, double s, String c) {
        name = n;
        roll = r;
        spi = s;
        cours = c;

    }

    void set() {

        System.out.println(" name : " + name + " roll number : " + roll + " cours  : " + cours);

    }

}

public class Student {
    public static void main(String[] args) {
        Std sa = new Std();
        Std sb = new Std();
        Std sc = new Std();
        sa.get("rajal", 45, 6.8, "BAC");
        sb.get("bansi", 46, 7.8, "BBA");
        sc.get("PRINCE", 47, 8.8, "BATECH");
        sa.set();
        sb.set();
        sc.set();

    }

}
