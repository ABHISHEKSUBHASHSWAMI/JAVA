//Write a java program to create threads using Extending the Thread Class

class MyThread extends Thread
{
    public void run()
    {
            System.out.println("Child Thread");
    }
}

public class Test1
{
    public static void main(String[] args)
    {
        MyThread t = new MyThread();
        t.start();

        System.out.println("Main Thread");
    }
}
