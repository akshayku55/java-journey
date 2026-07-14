public class practice {
    public static void main(String[] args){
           Student s1 = new Student();
           Student s2 = new Student();
           s1.name = "Akshay";
           s2.name = "Rahul";
           s1.college = "PPU";
           System.out.println(Student.college);
    }
}
class Student {
    static String college = "LPU";
    String name;
}