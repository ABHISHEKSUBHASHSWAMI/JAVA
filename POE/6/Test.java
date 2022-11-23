//Create the interface stack which has variable size, abstract methods push (), pop (), display (), overflow () and underflow (). Implement subclass IntegerStack by implementing interface. Create one test class and check for the working of all the methods of IntergerStack class.

import java.util.Scanner;

interface Stack
{
    void push(int item);
    int pop();
    void display();
    void overflow();
    void underflow();
}

class IntegerStack implements Stack
{
    int[] stack= new int[5];
    int top;

    void initiateStack()
    {
        top=-1;
    }

    public void push(int num)
    {
        if(top==4)
        {
            overflow();
        }
        else
        {
            top++;
            stack[top]=num;
            System.out.println("Number pushed to stack.\n");
        }
    }
    
    public int pop()
    {
        if(top==-1)
        {
            underflow();
            return 0;
        }
            
        else
        {
            return stack[top--];
        }
    }

    public void display()
    {
        if(top==-1)
        {
            underflow();
        }
        else
        {
            System.out.print("\nStack is :\t");
            for(int i=top;i>=0;i--)
            {
                System.out.print(stack[i]+" ");
            }
            System.out.println("\n");
        }
    }
    public void overflow()
    {
        System.out.println("\nStack Overflow\n");
    }
    public void underflow()
    {
        System.out.println("\nStack Underflow\n");
    }
}

class Test
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        IntegerStack stack1=new IntegerStack();
        stack1.initiateStack();
        int option;

        do{
            System.out.println("1. Push an element");
            System.out.println("2. Pop an element");
            System.out.println("3. Display the stack");
            System.out.println("4. Exit");

            System.out.print("\nEnter your choice: ");
            option=input.nextInt();

            switch(option)
            {
                case 1:
                    System.out.print("\nEnter a number to push: ");
                    int num=input.nextInt();
                    stack1.push(num);
                    break;
                case 2:
                    stack1.pop();
                    break;
                case 3:
                    stack1.display();
                    break;
                case 4:
                    System.out.println("\nExiting...");
                    break;
            }
        }
        while(option<4);
        input.close();
        if(option>4)
        {
            System.out.println("\nInvalid option\n");
        }
    }
}