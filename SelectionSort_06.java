public class SelectionSort_06 {
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void SelectionSort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int smallestIndex=i;
           for(int j=i+1;j<n;j++){
               if(arr[j]<arr[smallestIndex]){
                   smallestIndex=j;
               }
           }
           swap(arr,i,smallestIndex);
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 5, 4, 6, 9, 8};
        SelectionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

//Time Complexity: O(n²) in all cases (best, average, worst).
//Space Complexity: O(1).