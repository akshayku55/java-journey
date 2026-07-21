 class Revision {
    public static void main(String[] args) {
        // Revising immutable classes
        // Student s1 = new Student("AKshay",22);
        // s1.setName("Mehak");
        // s1.setAge(20);
        // String s2 = s1.getName();
        // int a2 =  s1.getAge();
        // s1.markAttendance();
        // System.out.println(s2+" "+a2);
        Student s1 = new Student("Akshay",22,"CGC");
        
    }
}

// normal class
final class Student {
    private final String name;
    private final int age;
    private final String college;
    Student(String name, int age,String college){
        this.name = name;
        this.age = age;
        this.college = college;
    }

    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public String getCollege(){
        return this.college;
    }








    // normal class
//    int age;
//    String name;
//    Student(String name, int age){
//         this.name = name;
//         this.age = age;
//    }
//    public void setName(String name){
//           this.name = name;
//    }
//    public void setAge(int age){
//           this.age = age;
//    }
//    public String getName(){
//       return this.name;
//    }
//    public int getAge(){
//       return this.age;
//    }
//    public void markAttendance(){
//     System.out.println("Mark attendance");
//    }
}

class College {
    String name;
    String address;

    College(String name, String address){
        this.name = name;
        this.address = address;
    }
}