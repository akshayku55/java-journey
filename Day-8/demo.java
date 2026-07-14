public class demo {
    // nested classes
    public static void main(String[] args) {
        // Outer out = new Outer();
        // Outer.Inner in = new Outer.Inner(out);
        // in.fun();
    }
}
// static class can extend classes and implements interfaces
// class Outer {

//     private static int x =  4;
//     int y = 8;

//     static class Inner {
//         private String name;
//         // Using Constructor
//         Outer out = new Outer();
//         Inner(Outer out){
//             this.out = out;
//         }
//         // void fun(){
//         //     System.out.println("Hello");
//         //     // static nested class can access static variables/,ethods of outer class
//         //     System.out.println(x);
//         //     // System.out.println(y); y cant be acessed
//         // }

//         void fun(){
//             System.out.println(x);
//             System.out.println(out.y);
//         }
//     }
// }

class BankAccount {

    private static class InterestCalculator {
        private int x;
        static double calculateYearly(double principle, double rate){
            return principle*rate;
        }
        static double calculateMonthly(double principle,double time){
            return principle*time;
        }

    }
      public double computeInterest(double principle) {
            return InterestCalculator.calculateYearly(principle, 0.09);
      }
      
}

// use cases of static nested class 
/*
1. As helper class for any outer class
2.Builder design pattern
3.if u want to have static methods inside a nested class 
4. Request/Response DTO 


*/