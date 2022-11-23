//Create a sub package in the math package -convert. In “convert” package provide classes to convert decimal to octal, binary, hex and vice-versa.

package stat;

public class Convert {
    int octalTodecimal(int n)
    {
        return Integer.parseInt(Integer.toString(n),8);
    }
    int binaryTodecimal(int n){
        return Integer.parseInt(Integer.toString(n),2);
    }
    int hexTodecimal(int n)
    {
        return Integer.parseInt(Integer.toString(n),16);
    }
    String octal(int n)
    {
        return Integer.toOctalString(n);
    }
    String binary(int n)
    {
        return Integer.toBinaryString(n);
    }
    String hex(int n)
    {
        return Integer.toHexString(n);
    }
    
}


