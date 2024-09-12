import java.util.Arrays;

public class BinarySearch_02 {
    static int BinarySearch(int[] arr,int low,int high,int value){
        int mid=(low+high)/2;
        if(arr[mid]==value){
            return mid;
        }
        if(value>arr[mid]){
            return BinarySearch(arr,mid+1,high,value);
        }
        if(value<arr[mid]){
            return BinarySearch(arr,low,mid-1,value);
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr={2,3,4,5,6,7,8};
        int value=4;
        int index=BinarySearch(arr,0,arr.length-1,value);
        System.out.println(value+ " found at index " +index);
    }
}
