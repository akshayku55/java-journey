import java.io.IOException;
public class demo {
    public static void main(String[] args)throws IOException{
        // System.out.println("hello");
        // System.err.println("Bye");

        // System.in
        int x = System.in.read();
        System.out.println((char)x);
        // read method reads 1 byte method at a time
    }
}
// systm is a class --> PrintStream out
// Prinstream --> println()
// java.lang by default lang package
// err -> error
// out --> output