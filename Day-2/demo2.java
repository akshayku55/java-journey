public class demo2{
    public static void main(String[] args){
      Student s1 = new Student("Mehak",22,23,"TYU");
      System.out.println(s1.name);
      System.out.println(s1.age);
      System.out.println(s1.rollNumber);
      System.out.println(s1.college);
      Student s2 = new Student();
       System.out.println(s2.name);
      System.out.println(s2.age);
      System.out.println(s2.rollNumber);
      System.out.println(s2.college);
      
    }
}
class Student{
    String name;
    int age;
    int rollNumber;
    String college;

    Student(){
        // name = "Akshay";
        // age = 22;
        // rollNumber = 2338393;
        // college = "XYX";
    }
    Student(String n, int a, int r, String c){
        name = n;
        age = a;
        rollNumber = r;
        college = c;
    }
}