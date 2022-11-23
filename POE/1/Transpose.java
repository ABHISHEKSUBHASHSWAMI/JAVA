import java.util.Scanner;

public class Transpose {
    public static void main(String args[]){  

        Scanner input=new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int r=input.nextInt();
        System.out.print("Enter number of columns : ");
        int c=input.nextInt();

        int original[][]=new int[r][c];
        int transpose[][]=new int[c][r];  
        
        System.out.println("Enter row-wise elements of original matrix : ");


        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                original[i][j]=input.nextInt();
            }
        }

        System.out.println("Original matrix is : ");

        for(int i=0;i<r;i++){    
            for(int j=0;j<c;j++){    
                System.out.print(original[i][j]+" "); 
            }
            System.out.println();
        } 

        System.out.println("Transpose of matrix is : ");

        for(int i=0;i<c;i++){    
            for(int j=0;j<r;j++){    
                transpose[i][j]=original[j][i];
                System.out.print(transpose[i][j]+" "); 
            }
            System.out.println();
        }
    input.close();    
    }
}
