public class first {
    public static void main(String[] args){
           Student s1 = new Student();
           s1.name = "Akshay";
           s1.age = 22;
           s1.rollNumber = 2338393;
           s1.college = "XYZ UNi";
           s1.markAttendance();
           s1.print();
    }
}
class Student {
    String name;
    int age;
    int rollNumber;
    String college;

    void markAttendance(){
        System.out.println("Attendnace marked by "+name);
    }
    void print(){
        System.out.println(name +" "+age+" "+rollNumber+" "+college);
    }
}