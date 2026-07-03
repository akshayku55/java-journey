// static keywork

public class demo {
    public static void main(String[] args){
          Student s1 = new Student("AKshay",22,233);
          Student s2 = new Student("mehak",23,12);

          System.out.println(s1.name+" "+s1.age+" "+s1.rollNumber+" "+s1.college);
           System.out.println(s2.name+" "+s2.age+" "+s2.rollNumber+" "+s2.college);
          
    }
}
class Student {
    String name;
    int age;
    int rollNumber;
    static String college;

    Student(String name,int age,int rollNumber){
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
    }

    // Static block -> used to ini static variables
    static {
        college = "IIT JAIPUR";
    }
}