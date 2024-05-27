
 class A {

    public int method(A a) {
        return 2;
    }
}

  class AX extends A {
     public int method(A a) {
         return 3;
     }

     public int method(AX ax) {
         return 4;
     }
 }

public class Main {
    public static void main(String[] args) {


        A a2 = new AX();
        AX ax = new AX();



        System.out.println(a2.method(ax)); // Line 4

    }
}
