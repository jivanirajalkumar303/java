
class area {

    double r;

    area(double r) {
        this.r = r;
    }

    void A() {
        System.out.println("area of cricle :" + (3.14 * r * r));
    }

}

public class areaOfCricle {

    public static void main(String[] args) {

        area a1 = new area(35);
        a1.A();

    }

}