//program to implement static variable and static block

class StaticTest
{
    static int a;
    static int b;
    static
    {
        a=10;
        b=20;
    }
    public static void main(String args[])
    {
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
}