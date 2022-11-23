//Java program to demonstrate the use of hierrarchical inheritance
class A{
    int a=100;
    int b=20;
    void display(){
        System.out.println("\na="+a);
        System.out.println("b="+b);
    }
}
class B extends A{
    void add(){
        System.out.println("a+b="+(a+b));
    }
}

class C extends A{
    void sub(){
        System.out.println("a-b="+(a-b));
    }
}

class D extends A{
    void mul(){
        System.out.println("a*b="+(a*b));
    }
}

class E extends A{
    void div(){
        System.out.println("a/b="+(a/b));
    }
}

class Hierrarchical{
    public static void main(String[] args){
        B b=new B();
        b.display();
        b.add();
        C c=new C();
        c.display();
        c.sub();
        D d=new D();
        d.display();
        d.mul();
        E e=new E();
        e.display();
        e.div();
    }
}