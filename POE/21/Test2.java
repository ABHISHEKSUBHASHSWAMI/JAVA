//B. Find area of circle, triangle using constructor overloading.

import java.util.Scanner;

class Area
{
    double area;
    Area(double r)
    {
        area = 3.14*r*r;
    }
    Area(double b, double h)
    {
        area = 0.5*b*h;
    }
    void display()
    {
        System.out.println("Area = "+area);
    }
}

public class Test2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of circle: ");
        double r = sc.nextDouble();
        Area a1 = new Area(r);
        System.out.println("Enter base and height of triangle: ");
        double b = sc.nextDouble();
        double h = sc.nextDouble();
        Area a2 = new Area(b,h);
        a1.display();
        a2.display();
    }
}
