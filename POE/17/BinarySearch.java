// Write Java Program to perform Binary search.

import java.util.Scanner;

class BinarySearch{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.print("Enter the number to search : ");
        int num = sc.nextInt();
        int low = 0;
        int high = arr.length-1;
        int mid = (low+high)/2;
        while(low<=high){
            if(arr[mid]==num){
                System.out.println("Number found at index "+mid);
                break;
            }
            else if(arr[mid]<num){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
            mid = (low+high)/2;
        }
        if(low>high){
            System.out.println("Number not found");
        }
    }
}