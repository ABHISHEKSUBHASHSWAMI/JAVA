import java.util.Scanner;
public class SymmetricMatrix {
    
    public static void main(String args[]){  
        int count=1;
        
        Scanner input=new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int r=input.nextInt();
        System.out.print("Enter number of columns : ");
        int c=input.nextInt();
        if(c==r){
            int original[][]=new int[r][c];
            int transpose[][]=new int[c][r];  
        
            System.out.println("Enter row-wise elements of original matrix : ");


            for(int i=0;i<r;i++){
                for(int j=0;j<c;j++){
                    original[i][j]=input.nextInt();
                }
            }

            for(int i=0;i<r;i++){    
                for(int j=0;j<c;j++){    
                    transpose[i][j]=original[j][i];
                }
            }

            for(int i=0;i<r;i++){
                for(int j=0;j<c;j++){
                    if(original[i][j]==transpose[i][j]){
                        count=1;
                    }
                    else{
                        count=0;
                    }
                }
            }
            if(count == 1) {
                System.out.println("\nMatrix is a Symmetric Matrix");
            }
            else {
                System.out.println("\nMatrix is Not a Symmetric Matrix");
            }   
        }

        else{
            System.out.println("Cannot form symmetric matrix");
        }
    input.close();   
    }
}