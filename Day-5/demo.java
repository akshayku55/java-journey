// inheritance
public class demo {
    public static void main(String[] args){
        EngineeringStudent es = new EngineeringStudent();
        es.markAttendance();
        es.attendLab();
    }
}
// parent (superclass) child(subclass) relationship
class Student {
    String name;
    int age;

      void markAttendance(){
        System.out.println("Attendance marked: ");
    }
}

class EngineeringStudent extends Student {
    void attendLab(){
        System.out.println("Lab Attended: ");
    }
}