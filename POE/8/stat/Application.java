package stat;
//Develop application to use stat package

// package stat;

public class Application{
    public static void main(String[] args) {
        Maths m=new Maths();
        System.out.println(m.fact(5));
        System.out.println(m.cube(5));

        //use of conversion

        Convert c=new Convert();
        //decimal to binary and vice versa
        System.out.println(c.binary(10));
        System.out.println(c.binaryTodecimal(101011));

        //decimal to octal and vice versa
        System.out.println(c.octal(10));
        System.out.println(c.octalTodecimal(10));

        //decimal to hex and vice versa
        System.out.println(c.hex(10));
        System.out.println(c.hexTodecimal(10));
    }
}   
