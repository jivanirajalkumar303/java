// Create class BankDemo and Account(accNum:int, accType:String, balance: double). 
// Implement getter() and setter() method to assign and display data for 3 students.[A] 

// Write a Java program to create a class called Employee with a name, job title, and salary 
// attributes, and methods to calculate and update salary. 

// import java.util.Scanner;

import java.util.Scanner;

class Employee {
    String name;
    String titale;
    double salary;

    void set(String name, String titale, double salary) {
        this.name = name;
        this.titale = titale;
        this.salary = salary;

    }

    void get() {
        System.out.println(" name : " + name + " job title  : " + titale + "job salary : " + salary);
    }

    void incree(double i) {
        salary = salary + i;
        System.out.println("increement salary  :" + salary);
    }

    void updates() {

        double u = salary * 12;
        System.out.println("  update salary  :" + u);
    }

}

public class EM {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee s1 = new Employee();
        s1.set("rajal", "boss", 1500);
        s1.get();
        System.out.println("enter a increement salary :");
        double in = sc.nextInt();
        s1.incree(in);
        s1.updates();

    }
}