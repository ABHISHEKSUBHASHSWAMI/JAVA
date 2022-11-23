//Write a program to A. Demonstrate use of super keyword.

class Vehical{
    int speed=150;
    void display(){
        System.out.println("Speed of Vehical is "+speed);
    }
}
class Car extends Vehical{
    int speed=200;
    void display(){
        System.out.println("Speed of Car is "+speed);
        System.out.println("Speed of Vehical is "+super.speed);
    }
}
public class Test1 {
    public static void main(String[] args) {
        Car c=new Car();
        c.display();
    }
}