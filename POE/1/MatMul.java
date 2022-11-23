import java.util.Scanner;

public class MatMul {
    public static void main(String args[]){

        Scanner input= new Scanner(System.in);
        System.out.print("Enter rows in matrix 1 : ");
        int r1=input.nextInt();
        System.out.print("Enter columns in matrix 1 : ");
        int c1=input.nextInt();
        System.out.print("Enter rows in matrix 2 : ");
        int r2=input.nextInt();
        System.out.print("Enter columns in matrix 2 : ");
        int c2=input.nextInt();


        if(c1==r2){

            int[][] matrix1=new int[r1][c1];
            int[][] matrix2=new int[r2][c2];
            int[][] result=new int[r1][c2];

            System.out.println("Enter row-wise values for matrix 1 : ");

            for(int i=0;i<r1;i++){
                for(int j=0;j<c1;j++){
                    matrix1[i][j]=input.nextInt();
                }
            }
            
            System.out.println("Enter row-wise values for matrix 2 : ");

            for(int i=0;i<r2;i++){
                for(int j=0;j<c2;j++){
                    matrix2[i][j]=input.nextInt();
                }
            }

            System.out.println("\nMatrix 1 :\n");
            for(int l=0;l<r1;l++){
                for(int m=0;m<c1;m++){
                    System.out.print(" "+matrix1[l][m]);
                }
                System.out.println();
            }
            System.out.println("\nMatrix 2 :\n");

            for(int v=0;v<r2;v++){
                for(int w=0;w<c2;w++){
                    System.out.print(" "+matrix2[v][w]);
                }
                System.out.println();
            }

            System.out.println("\nMultiplication given matrices is : \n");

            for(int i=0;i<r1;i++){
                for(int j=0;j<c2;j++){
                    result[i][j]=0;
                    for(int k=0;k<c1;k++){      
                        result[i][j]+=matrix1[i][k]*matrix2[k][j];      
                    }

                    System.out.print(result[i][j]+" ");
                }
                System.out.println("\n");
            }
        }
        
        else{
            System.out.println("Matrix Multiplication is not possible. Columns of matrix 1 and rows of matrix 2 are not equal.");
        }
    input.close();
    }
}