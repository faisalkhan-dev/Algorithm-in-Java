import java.util.Arrays;

public class BinarySearch_02 {
    static int BinarySearch(int[] arr,int low,int high,int value){
        if(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==value){
                return mid;
            }
            if(value>arr[mid]){
                return BinarySearch(arr,mid+1,high,value);
            }
            if(value<arr[mid]) {
                return BinarySearch(arr, low, mid - 1, value);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr={2,3,4,5,6,7,8};
        int value=8;
        int index=BinarySearch(arr,0,arr.length-1,value);
        if(index!=-1){
            System.out.println(value+ " found at index " +index);
        }
        else{
            System.out.println(value+ " is not found");
        }
    }
}

//Time Complexity: O(1) in best case and O(log n) in the average and worst cases.
//Space Complexity: O(1) for the iterative version, and O(log n) for the recursive version.
