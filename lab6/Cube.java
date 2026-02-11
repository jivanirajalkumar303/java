// Create class Cube with attributes (height, width and depth with double datatype). 
// Implement getter() and setter() method to assign data for 2 cubes. Create method 
// volume() to calculate volume for 2 cubes. [A] 

class Lbh {

    Double length;
    Double width;
    double depth;

    void get(double l, double w, double d) {
        length = l;
        width = w;
        depth = d;

    }

    void set() {
        System.out.println(" volume :" + (length * depth * width));

    }

}

public class Cube {
    public static void main(String[] args) {
        Lbh sa = new Lbh();
        Lbh sb = new Lbh();
        Lbh sc = new Lbh();
        sa.get(45, 45, 45);
        sb.get(60, 60, 60);
        sc.get(5, 12.5, 13);
        sa.set();
        sb.set();
        sc.set();

    }

}
