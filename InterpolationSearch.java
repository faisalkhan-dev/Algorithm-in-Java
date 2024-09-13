public class InterpolationSearch {

    //Recursive implementation
    static int InterpolationSearch(int[] arr,int low,int high,int value){
        if(low<=high && value>=arr[low] && value<=arr[high]){
            int position=(low+((value-arr[low])/(arr[high]-arr[low])*(high-low)));
            if(arr[position]==value){
                return position;
            }
            else{
                if(value>arr[position]){
                    return InterpolationSearch(arr,position+1,high,value);
                }
                if(value<arr[position]){
                    return InterpolationSearch(arr,low,position-1,value);
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr={2,4,6,8,11,13,15,19};
        int value=0;
        int index=InterpolationSearch(arr,0,arr.length-1,value);
        if(index!=-1){
            System.out.println(value +" is found at index "+ index);
        }
        else{
            System.out.println(value + " is not found");
        }
    }
}

//Iterative implementation
//public class InterpolationSearchIterative {
//    static int interpolationSearch(int[] arr, int low, int high, int value) {
//        while (low <= high && value >= arr[low] && value <= arr[high]) {
//            // Calculate the position using the interpolation formula
//            int position = low + ((value - arr[low]) * (high - low)) / (arr[high] - arr[low]);
//
//            // Ensure position is within bounds
//            if (position < low || position > high) {
//                return -1;
//            }
//
//            // If the value is found at the calculated position
//            if (arr[position] == value) {
//                return position;
//            }
//
//            // If the value is larger, search the upper part
//            if (arr[position] < value) {
//                low = position + 1;
//            }
//            // If the value is smaller, search the lower part
//            else if (arr[position] > value) {
//                high = position - 1;
//            }
//        }
//        // Value not found
//        return -1;
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {2, 4, 6, 8, 11, 13, 15, 19};
//        int value = 13;
//        int index = interpolationSearch(arr, 0, arr.length - 1, value);
//        System.out.println(value + " is found at index " + index);
//    }
//}





//Conditions for Interpolation Search:
//Sorted Array: The array must be sorted in ascending order.
//Uniform Distribution: Interpolation search performs best when the values are uniformly distributed.
//If values are not uniformly distributed, the performance may degrade.
//
// Interpolation Search Complexity:
//
//        Time Complexity:
//        - Best Case:( O(log log n) )
//        - Average Case:( O(log log n) )
//        - Worst Case:( O(n) )
//
//        - Space Complexity:
//        - Auxiliary Space: ( O(log n) ) (
//                for recursive implementation)
//                or ( O(1) ) (for iterative implementation)
