//Write a Java program to find the angle between the hour and minute hands.[A]

class angleOfhoAndMi {
    double hour;
    double minute;

    angleOfhoAndMi(double hour, double minute) {
        this.hour = hour;
        this.minute = minute;

    }

    void A() {
        double am = minute * 6;
        double ah = 30 * hour + 0.5 * minute;
        double ang = Math.abs(am - ah);

        if (ang > 180) {
            ang = 360 - ang;
            System.out.println(ang);

        } else {
            System.out.println(ang);

        }
    }

}

public class angle {
    public static void main(String[] args) {
        angleOfhoAndMi a1 = new angleOfhoAndMi(12, 15);
        a1.A();

    }

}
