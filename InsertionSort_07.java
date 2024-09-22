public class InsertionSort_07 {
    static void InsertionSort(int[] arr){
        int n=arr.length;
        for(int i=1;i<n;i++){
           int key=arr[i];
           int j=i-1;
           while( j>=0 && arr[j]>key) {     //while( arr[j]>key && j>=0) ,it will return index out of bound
               arr[j+1]=arr[j];
               j--;
           }
           arr[j+1]=key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 5, 4, 6, 9, 8};
        InsertionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

//Time: O(n²) in the average and worst cases, O(n) in the best case.
//Space: O(1) (in-place sorting).