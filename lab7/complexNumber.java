// Define class for Complex number with real and imaginary as data members. Create its 
// constructor, overload the constructors. Also define addition method to add two 
// complex objects. [C] 

class number {
    double real;
    double img;

    number() {
        this.img = 0;
        this.real = 0;

    }

    number(double real, double img) {
        this.img = img;
        this.real = real;

    }
     number add(number c){

          number r=new number();
          r.real=real+c.real;
          r.img=img+c.img;
          return r;
       

     }
      void display() {
        System.out.println(real + " + " + img + "i");
    }



}

public class complexNumber {
    public static void main(String[] args) {
        number c1=new number(4, 5);
        number c2=new number(4, 5);
        number c3=c1.add(c2);
        c3.display();

        

        
    }
}
