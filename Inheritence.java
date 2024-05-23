
/*4. Write a program in Java to demonstrate single inheritance,
multilevel inheritance and hierarchical inheritance. */
class single{
    static  class Singel_Inheritence{

        Singel_Inheritence() {
        System.err.println("This is first Singel_Inheritence"); 
        }
    }
    static class Singel_Inheritence1 extends Singel_Inheritence{

        Singel_Inheritence1() {
        System.err.println("This is first Singel_Inheritence1"); 

        }
    }
}

class multilevel{
    class multilevel_inheritance {

        multilevel_inheritance() {
        System.err.println("This is first multilevel_Inheritence"); 
        }
    }
    class multilevel_inheritance1 extends multilevel_inheritance{

        multilevel_inheritance1() {
        System.err.println("This is first multilevel_Inheritence1"); 

        }
    }
    class multilevel_inheritance2 extends multilevel_inheritance1{

        multilevel_inheritance2() {
        System.err.println("This is first multilevel_Inheritence2"); 

        }
    }
}

class hierarchical{
    class hierarchical_inheritance1{
        hierarchical_inheritance1(){
            System.err.println("this hierarchical_inheritance1");
        }
    }
    class hierarchical_inheritance2 extends hierarchical_inheritance1{
        hierarchical_inheritance2(){
            System.out.println("this hierarchical_inheritance2");
        }
    }
    class hierarchical_inheritance3 extends hierarchical_inheritance1{

        hierarchical_inheritance3() {
            System.err.println("this hierarchical_inheritance3");
        }
        
    }
}



public class Inheritence {

    public static void main(String[] args) {
        single.Singel_Inheritence1 s=new single.Singel_Inheritence1();

        multilevel m_obj=new multilevel();
        multilevel.multilevel_inheritance2 mi=m_obj.new multilevel_inheritance2();
    }
}
