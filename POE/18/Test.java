//Write a program to perform multilevel inheritance.

class A
{
    int a=10;
    void display()
    {
        System.out.println("Value of a is "+a);
    }
}

class B extends A
{
    int b=20;
    void show()
    {
        System.out.println("Value of b is "+b);
    }
}

class C extends B
{
    int c=30;
    void print()
    {
        System.out.println("Value of c is "+c);
    }
}

class Test
{
    public static void main(String args[])
    {
        C obj=new C();
        obj.display();
        obj.show();
        obj.print();
    }
}
