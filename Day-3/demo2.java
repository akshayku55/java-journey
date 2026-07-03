public class demo2 {
    public static void main(String[] args){
           Random r1 = new Random();
           System.out.println(r1.PI);
        //    r1.PI = 3.4; we cannot do this
        final int x = 4; // final is like constant
        System.out.println(x);

    }

}
// why main method is static in java
// demo4 d1 = new demo4();
// d1.main()
class Random{
    // final double PI = 3.14;
    // double PI;
    // Random(){
    //     this.PI = 3.14;
    // }

    static final double PI;
    static {
        PI = 3.14;
    }
}