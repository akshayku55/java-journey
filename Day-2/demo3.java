public class demo3 {
    public static void main(String[] args){
       Student s1 = new Student();
    //    Student s2 = new Student("AKshay");
    //    Student s3 = new Student("mehak",33);
    //    Student s4 = new Student("ak",11,33432);
    //    Student s5 = new Student("lakshay",22,4321,"IIT DELHi");
       System.out.println(s1.name);
       System.out.println(s1.age);
       System.out.println(s1.rollNumber);
       System.out.println(s1.college);
    }
}
class Student {
    String name;
    int age;
    int rollNumber;
    String college;
// constructor chaining works like recursion
    Student() {
        this("Unknown");
        System.out.println("I am in first constructor");
    };
    Student(String name){
        this(name,0);
        System.out.println("I am in second constructor");
    }
    Student(String name, int age){
      this(name,age,0);
      System.out.println("I am in third constructor");
    }
    Student(String name, int age,int rollNumber){
      this(name,age,rollNumber,null);
      System.out.println("I am in fourth constructor");
    }
     Student(String name, int age,int rollNumber,String college){
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
        this.college = college;
        System.out.println("I am in fifth constructor");
    }
}