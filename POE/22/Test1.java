//Write a program to demonstrate  Function Overloading

class Sum{
    int add(int a, int b){
        return a+b;
    }
    int add(int a, int b, int c){
        return a+b+c;
    }
    double add(double a, double b){
        return a+b;
    }
}

public class Test1 {
    public static void main(String[] args) {
        Sum s = new Sum();
        System.out.println(s.add(10, 20));
        System.out.println(s.add(10, 20, 30));
        System.out.println(s.add(10.5, 20.5));
    }
}