public class Epettne {
    public static void main(String[] args) {
       
         int a = 1;
          int b = 6;
           int c = 10;
            int d = 13;
             int e = 15;
        

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == 1) {
                    System.out.print(a+" ");
                    a++;
                }
                if (j == 2) {
                    System.out.print(b+" ");
                    b++;
                }
                if (j == 3) {
                    System.out.print(c+" ");
                    c++;
                }
                if (j == 4) {
                    System.out.print(d+" ");
                    d++;
                }
                if (j == 5) {
                    System.out.print(e+" ");
                    e++;
                }
               
            }
            System.out.println();
        }
 
    }
}
