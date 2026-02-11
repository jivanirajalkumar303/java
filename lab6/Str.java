// Write a program to find length of string and print second half of the string.[C]

import java.util.Scanner;

class Str {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("ENTER A STRING");
      String n = sc.nextLine();
      int l = n.length();
      System.out.println("string lenth :  " + l);
      int h = l / 2;
      for (int i = h; i < l; i++) {
         char cu = n.charAt(i);
         System.out.print(cu);

      }

   }

}
