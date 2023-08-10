 public class Floor {
        public static void main(String[] args) {
            int[] arr = {2, 3, 5, 14, 16, 18};
            int target = 15;
            int ans = floor(arr, target);
            System.out.println("The Floor of target element is " + ans);
        }

        static int floor(int[] arr, int target) {
            int start = 0;
            int end = arr.length - 1;

            while (start <= end) {
                //first find the mid-element
                int mid = start + (end - start) / 2;
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > mid) {
                    start = mid + 1;
                } else {
                    return arr[mid];
                }
            }
            return arr[end];
        }
    }
