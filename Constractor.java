
/*2. Write a program in Java to develop overloaded constructor. Also
develop the copy constructor to create a new object with the
state of the existing object.*/


class myclass{
    int n;

    myclass() {
        System.out.println("Default constaractor");
    }
    myclass(int a,int b) {
        System.out.println("Result of sum "+(a+b));
    }
    myclass(myclass cp , int r) {
        this(); // call default constractor 
        n=cp.n;
        System.out.println(n*r);
    }
    myclass(int a) {
        System.out.println(a);
    }
    
}

public class Constractor {
    public static void main(String[] args) {
        myclass foo = new myclass(2,3);
        myclass foo1 = new myclass(2);
        myclass foo2 = new myclass(foo1,3);
    }   
}
