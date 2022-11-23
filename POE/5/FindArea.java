//Create abstract class shape with dim1, dim2 variables and abstract area() method. Class rectangle and triangle inherits shape class. Calculate area of rectangle and triangle.

import java.util.Scanner;

interface Shape{
    void area();
}

class Rectangle implements Shape{
    int length;
    int breadth;
    public void area(){
        System.out.println("Area of rectangle is "+(length*breadth));
    }
}

class Triangle implements Shape{
    int base;
    int height;
    public void area(){
        System.out.println("Area of triangle is "+(0.5*base*height));
    }
}

public class FindArea {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        Triangle t = new Triangle();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter length and breadth of rectangle : ");
        r.length = input.nextInt();
        r.breadth = input.nextInt();
        System.out.print("Enter base and height of triangle : ");
        t.base = input.nextInt();
        t.height = input.nextInt();
        r.area();
        t.area();
    }
}
