public class demo4 {
    public static void main(String[] args){
           Animal a = new Dog("Mickey");
           a.makeSound();
    }
}
 abstract class Animal {
    String name;
    abstract void makeSound();

    void sleep(){
        System.out.println("Sleeping");
    }
    Animal(String name){
        this.name = name;
    }

 }
 class Dog extends Animal {
    Dog(String name){
        super(name);
    }
    @Override 
    void makeSound(){
        System.out.println("BARK");
    }
 }
// Abstract Classes
// 1. Cannot be instatisated directly
// 2. can conatin abstract method(method without implementation)
// 3 Can also contain normal methods
//4 is meant to be extended

// Questions
// Can abstract classes have constructors-> yes
// Can abstarct classes be final? no the abstarct class cant be final
// can abstract class can have static varibales or methods? -> yes
// can abstarct classes have private methods? yes private methds are allowed
// Can abstarct classes have final methods?--> yes
// can abstrcat classes have no abstract method? -> yes