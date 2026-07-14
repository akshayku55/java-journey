public class demo2 {
    public static void main(String[] args) {
    //    Outer outer = new Outer();
    //    Outer.Inner inner = new Outer.inner; // not applicable in inner class
    //    Outer.Inner inner = outer.new Inner(); 
    Outer.Inner inn = new Outer().new Inner();
    inn.fun();
    inn.fun2();
    }
}
class Outer {
    int x = 10;
    class Inner {
       // int x = 20;
        void fun(){
            System.out.println(Outer.this.x); // this stores current refernece of class
        }

        static void fun2(){
            System.out.println("hello");
        }
        // upto true till java 16
    }
}