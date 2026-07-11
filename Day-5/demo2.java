// types of inheritance
// simple inheritance 
// multi-level inheritance 
// hierarchial 
// multiple (not supported in java)

public class demo2 {
    public static void main(String[] args) {
        cseStudent c = new cseStudent();
        c.markAttendance();
        
        }
}

class Student { //  Parent class
    String name;
    int age;

    public void markAttendance(){
        System.out.println("Mark Attendance");
    }
}

class Engineer extends Student {
    void attendLab(){
        System.out.println("Attending lab");
    }
}

/* 
multi level inheritance 

A class Parent of B class Parent of C


*/ 
// class cseStudent extends EngineeringStudent{
//         void attendCLab() {
//             System.out.println("cseStudent here");
//         }
// }

//  hierarchial
/*
      A
    /   \
    B    C

*/
class cseStudent extends Student{
        void attendCLab() {
            System.out.println("cseStudent here");
        }
}

/*
Multiple 
   A   B
   \   /
     C
 */