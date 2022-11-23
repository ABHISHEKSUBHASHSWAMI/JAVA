//Write a java program to create threads using Implementing the Runnable Interface

class MyThread implements Runnable
{
    public void run()
    {
            System.out.println("Child Thread");
    }
}

public class Test2
{
    public static void main(String[] args)
    {
        MyThread t = new MyThread();
        Thread t1 = new Thread(t);
        t1.start();

        System.out.println("Main Thread");
    }
}
