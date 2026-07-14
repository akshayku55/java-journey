// Anonymous class
public class demo4 {
    public static void main(String[] args) {
        Person p1 = new Person(){
            @Override
            void introduce(){
                System.out.println("Hellp");
            }
        };
        p1.introduce();
    }
}

class Person{
    void introduce(){
        System.out.println("Hi, i am a person");
    }
}