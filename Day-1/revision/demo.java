public class demo{
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        s1.name = "Akshy";
        s2.name ="kdjd";
        s1.markAttendance();
        s2.markAttendance();

    }
}

class Student {
    int age;
    String name;
    String college;

    void markAttendance(){
        System.out.println("Attendance marked"+" "+this.name);
    }
}