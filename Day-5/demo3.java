public class demo3 {
    public static void main(String[] args) {
        EngineeringStudent es = new EngineeringStudent("Akshay",2338393,101,"IIT");
        es.name = "Akshay";
        es.age = 22;
        es.rollNo = 2338393;
        es.print();

    }
}

class Student {
    String name;
    int age;
    int rollNo;       

     Student(String name, int age, int rollNo) {
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
    }
    
     void print(){
       System.out.println(name+" "+age+" "+rollNo);

    }
} 

class EngineeringStudent extends Student{
    String college;

     EngineeringStudent(String name, int age,int rollNo,String college) {
        super(name,age,rollNo);
        this.college = college;
    }
    
    void print(){

        super.print();
    }
}