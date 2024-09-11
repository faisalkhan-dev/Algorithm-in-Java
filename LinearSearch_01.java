import java.util.Scanner;

public class LinearSearch_01 {
     static  int   LinearSearch(int[] arr,int value){
        for(int i=0;i<arr.length;i++){
            if(value==arr[i]){
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr={2,4,3,1,6,5};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value you want to find in array");
        int value=sc.nextInt();
        int index=LinearSearch(arr,value);
        System.out.println(value+ " is found at index "+index);
    }
}


//  Time Complexity: O(n)
//        - **Best-case**: O(1)    (if the target is the first element)
//        - **Average-case**: O(n) (on average, may need to check about half of the elements)
//        - **Worst-case**: O(n)   (if the target is the last element or not present)
//
//        - **Space Complexity**: O(1)

