// Create class BankDemo and Account(accNum:int, accType:String, balance: double). 
// Implement getter() and setter() method to assign and display data for 3 students.[A]  

class B {
    int an;
    String type;
    double balnce;

    void set(int n, String t, double b) {
        an = n;
        type = t;
        balnce = b;

    }

    void get() {
        System.out.println(" accnum :" + an + " acctype :" + type + "balnce : " + balnce);
    }
}

    public class Bank {
        public static void main(String[] args) {

            B a1 = new B();
            B a2 = new B();
            B a3 = new B();
            a1.set(456565, "saveing", 450000);
            a2.set(4565455, "sav", 450070);
            a3.set(4454565, "save", 455000);
            a1.get();
            a2.get();
            a3.get();

        }

    }

