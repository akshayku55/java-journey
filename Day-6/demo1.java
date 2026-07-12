public class demo1 {
    public static void main(String[] args) {
        Car c = new FuelCar();
        c.start();
        c.accelerate();
        c.brake();

        Car c1 = new Electric();
        c1.start();
        c1.accelerate();
        c1.brake();
    }
}

// abstract class Car {
//     abstract void start();
//     abstract void accelerate();
//     abstract void brake();
// }

// class FuelCar extends Car {
//     void start(){
//         System.out.println("FuelCar starting");
//     }
//     void accelerate(){
//         System.out.println("FuelCar accelerate");
//     }
//     void brake(){
//         System.out.println("FuelCar brake");
//     }

// }
// class Electric extends Car{
//      void start(){
//         System.out.println("EV starting");
//     }
//     void accelerate(){
//         System.out.println("EV accelerate");
//     }
//     void brake(){
//         System.out.println("EV brake");
//     }

// }



// Interface 

interface  Car {
     void start();
     void accelerate();
     void brake();
}

class FuelCar implements  Car {
    @Override
    public void start(){
        System.out.println("FuelCar starting");
    }
    @Override
    public void accelerate(){
        System.out.println("FuelCar accelerate");
    }
    @Override
    public void brake(){
        System.out.println("FuelCar brake");
    }

}
class Electric implements Car{
    @Override
    public void start(){
        System.out.println("EV starting");
    }
    @Override
    public void accelerate(){
        System.out.println("EV accelerate");
    }
    @Override
    public void brake(){
        System.out.println("EV brake");
    }

}