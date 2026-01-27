public class Parsemethod {
    public static void main(String[] args) {
        System.out.println("enter a int");
        int a=Integer.parseInt(args[0]);
        System.out.println("entera float");
        float b=Float.parseFloat(args[1]);
        System.out.println("enter a double");
        double c=Double.parseDouble(args[2]);
        System.out.println("enter a string");
        char  d=args[3].charAt(0);
        System.out.println("all print");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

    }
}
