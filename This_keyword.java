

/*Write a program in Java to demonstrate use of this keyword.
        Check whether this can access the private members of the class
        or not. */
        
class InnerThis_keyword {
    private int num=90;
    void show(){
      
        System.out.println(  this.num+" "+"This is private mathod");
    }

    
}
public class This_keyword {
    public static void main(String[] args) {
        
        InnerThis_keyword obj =new InnerThis_keyword();
        obj.show();

    }
    
}
