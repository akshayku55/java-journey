public class demo3 {
    public static void main(String[] args) {
        // int x = 100;
        // int y = 100;

        // System.out.println(x == y); // true

        // Integer a = 200;
        // Integer b = 200;
        // System.out.println(a == b); // false

        Integer a = 20;
        Integer b = 20;
        System.out.println(a == b); // due to caching
        System.out.println(a.intValue()==b.intValue());
        System.out.println(a.equals(b));
    } 
}