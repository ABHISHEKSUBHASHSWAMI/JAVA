//implement program to find out factorial using command line argument

public class Factorial {
    int num;
    int factorial(int num){
        if(num==0 || num==1){
            return 1;
        }
        else{
            return num*factorial(num-1);
        }
    }

    public static void main(String[] args) {
        Factorial f = new Factorial();
        f.num = Integer.parseInt(args[0]);
        System.out.println("Factorial of "+f.num+" is "+f.factorial(f.num));
    }
}