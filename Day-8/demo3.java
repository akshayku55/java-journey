// local class
public class demo3 {
    public static void main (String[] args){
         Outer outer = new Outer();
         outer.greet();
    }
}
// effective final varibale 
class Outer {
    void greet(){
        class Local {
            int y = 4;
            // y-- cannot change
            void sayHello(){
                System.out.println(y);

            }
        }
        Local local = new Local();
        local.sayHello();
    }
}