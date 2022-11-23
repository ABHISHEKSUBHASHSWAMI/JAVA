//Develop a mathematical package for Statistical operations like factorial, cube. Create a sub package in the math package -convert. In “convert” package provide classes to convert decimal to octal, binary, hex and vice-versa. Develop application program to use this package.

package stat;

public class Maths{
    int fact(int n)
    {
        int f=1;
        for(int i=1;i<=n;i++)
        {
            f=f*i;
        }
        return f;
    }
    int cube(int n)
    {
        return n*n*n;
    }
}