public class BubbleSort_05 {
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void BubbleSort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<(n-i-1);j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr={2,3,1,5,4,6,9,8};
        BubbleSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}

// Time Complexity:
//        Best Case (Already Sorted):O(n)
//  (Only one pass is needed without any swaps)
//        Average and Worst Case:O(n²)
//  (Each pass compares and possibly swaps n-1 elements, and there are n passes)
//
// Space Complexity:
//        O(1)
//        (In-place sorting; only a constant amount of extra space is used)
