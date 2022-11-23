//Write a Java program to Find the second largest element in an array, Take number using command line arguments.


class SecondLargest{
    public static void main(String[] args){
        int[] arr = new int[args.length];
        for(int i=0;i<args.length;i++){
            arr[i] = Integer.parseInt(args[i]);
        }
        
        System.out.println("Given Array is ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
            }
        System.out.println();
        //sort
        for (int i = 0; i < arr.length; i++)   
        {  
            for (int j = i + 1; j < arr.length; j++)   
            {  
                if (arr[i] > arr[j])   
                {  
                    int temp = arr[i];  
                    arr[i] = arr[j];  
                    arr[j] = temp;  
                }  
            }  
        }  
        
        System.out.println("Second largest element in an array is: "+arr[arr.length-2]);

    }
}