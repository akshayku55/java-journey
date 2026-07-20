public class demo2 {
    public static void main(String[] args) {
        College college = new College("GC","CHD");
        Student s1 = new Student(22,"Akshay",college);

    }
}

// Immutable 
// defensive copy of college
final class Student {
    private final int age;
    private final String name;
    private final College college;
    Student(int age, String name,College college){
        this.name = name;
        this.age = age;
        this.college = new College(college.name,college.address);
    }
    // getters
    public int getAge(){
        return this.age;
    }
    public String getName(){
        return this.name;
    }
    public College getCollege(){
      return new College(this.college.name,this.college.name);
    }
}
// mutable
class College {
    String name;
    String address;
    College(String name, String address){
        this.name = name;
        this.address = address;
    }
}