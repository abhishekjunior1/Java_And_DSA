public class binaryseaarching {

    public static void main(String[] args) {
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int target = 22;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }

    // return the index
    // return -1 if it does not exist
    static int binarySearch(int[] arr, int target) 
    {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            // find the middle element
        //int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return -1;//for normal case we can use (index==0) insilizw with index 0

    }
}


// int index = 0;
//         int low = 0;
//         int high = array.length - 1;

//         while (low <= high) {
//             int mid = (low + high) / 2;

//             if (array[mid] == target) {
//                 index = mid;
//                 break;
//             } else if (array[mid] < target) {
//                 low = mid + 1;
//             } else {
//                 high = mid - 1;
//             }
//         }

//         if (index == 0) {
//             System.out.println("The target value is not found.");
//         } else {
//             System.out.println("The target value is found at index", index);
//         }