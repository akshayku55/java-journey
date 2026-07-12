public class demo2 {
    public static void main(String[] args){
        //  A a = new B();
        //  a.fun();

        A a = new B();
        System.out.print(a.x);
    }

}
// Static -> they belong to a class not to an object
// final after class thn that class cannot create child
// private methods cannot be oveerriddeen
// final methods cannot be overriden
// Fields / Variables cannot be polymorphic
// class A {
//     static void fun(){
//         System.out.println("Hello");
//     }
//     private void fun2(){
//         System.out.println("h1");
//     }
//     final void fun3(){
//         System.out.println("Hie");
//     }
// }
// class B extends A {
//     static void fun(){
//         System.out.println("Bye");
//     }
//     private void fun2(){
//         System.out.println("h1");
//     } // new fun is created here
//     // final void fun3(){
//     //     System.out.println("Hie");
//     // }
// }

class A {
    int x = 10;
}
class B extends A {
    int x = 20;
}