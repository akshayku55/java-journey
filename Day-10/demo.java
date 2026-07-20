public class demo {
    public static void main(String[] args) {
        
    
}
// Immutable (not purely immutable)
final class Student {
    private final int age;
    private final String name;
    private final College college;
    Student(int age, String name,College college){
        this.name = name;
        this.age = age;
        this.college = college;
    }
    // getters
    public int getAge(){
        return this.age;
    }
    public String getName(){
        return this.name;
    }
    public College getCollege(){
        return this.college;
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
}