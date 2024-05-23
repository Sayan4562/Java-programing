

/*3. Write a program in Java to demonstrate the use of 'final'
keyword in the field declaration. How it is accessed using the
objects. */

class myclass{
    private class in_myclass{
        in_myclass(){
            System.out.println("This is inner class of myclass");
        }
    }
    in_myclass ob=new in_myclass();
    private int s;
    void show(){
        System.out.println("This is myclass");
    }
}

public class Final_keword {
    public static void main(String[] args) {
        myclass obj=new myclass();

        obj.show();
    }
}
