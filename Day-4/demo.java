// encapsulation

public class demo {
    public static void main(String[] args){
        BankAccount ba = new BankAccount();
        ba.deposit(1000);
        System.out.println(ba.show());
        ba.withdraw(1100);
    }
}
class BankAccount {
       private double balance;
       public void deposit(double amount){
        balance = balance+amount;
        System.out.println("Updated Balance: "+balance);
       }
       // getters setters
       public void withdraw(double amount){
        if(balance>=amount && balance-amount>=0){
            balance = balance - amount;
        }
        else System.out.println("Insufficient balance: "+balance);
       }
       public double show(){
        return balance;
       }
    
  }

class Student {
    private String name;
    private int rollNumber;
    private int age;
    private String college;
    Student(String name, int rollNumber, int age, String college){
        this.name = name;
        this.rollNumber = rollNumber;
        this.age = age;
        this.college = college; 
    }
    public String getName(){
        return name;
    }
    public int getRoll(){
       return rollNumber;
    }
    public int getAge(){ 
        return age;
    }
    public String getCollege(){
        return college;
    }

    // setters
    public void setName(String name){
        this.name = name;
    } 
    public void setAge(int age){
       this.age = age;
    }
    public void setRoll(int rollNumber){
        this.rollNumber = rollNumber;
    }  
    public void setCollege(String college){
        this.college = college;
    }

}  