// Find the first and last occurence of element in the sorted asscendinf array

// import java.util.Arrays;

import java.util.Arrays;

public class Firstlast {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 7, 7, 7, 7, 8, 9 };
        int target = 7;
        int[] ans = { -1, -1 };
        int tan = firstIndex(arr, target);
        int may = lastIndex(arr, target);

        ans[0] = tan;
        ans[1] = may;
        System.out.println("the answer array is   " + Arrays.toString(ans));
        // System.out.println("this is first index " + firstIndex(arr, target));
        // System.out.println("this is last index " + lastIndex(arr, target));
    }

    public static int lastIndex(int[] arr, int target) {
        int start = 0;
        int end = arr.length;
        int li = -1;
        while (start < end) {
            int mid = (start + end) / 2;
            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                li = mid;
                start = mid + 1;
            }
        }
        System.out.println("this is last ooolalalalalalalalal");
        return li;
    }

    public static int firstIndex(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;
        int fi = -1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                fi = mid;
                end = mid - 1;
            }
        }
        // System.out.println("this is first index " + fi);
        return fi;

    }

    // Firstlast obj = new Firstlast(); // Create an instance of the class
    // System.out.println(obj.searchRange());

    // System.out.println("First Occurrence: " + result[0]);

    // System.out.println("Last Occurrence: " + result[1]);

    // int[] arr = {1,2,3,4,5,6,7,7,7,7,7,8,9};
    // int target = 7;
    // searchRange();

    // }

    // public int[] searchRange() {

    // System.out.println("this is searchRange");

    // int[] arr = { 1, 2, 3, 4, 5, 6, 7, 7, 7, 7, 7, 8, 9 };
    // int target = 7;
    // int[] ans = { -1, -1 };
    // int start = findstartindex(arr, target);
    // int end = findendindex(arr, target);

    // // int start = search(arr, target, true);
    // // System.out.println("this is "+ start);
    // // int end = search(arr, target, false);
    // // System.out.println("this is "+ end);

    // ans[0] = start;
    // ans[1] = end;
    // // System.out.println("this is ans " + Arrays.toString());
    // System.out.println("this is ans: " + Arrays.toString(ans));

    // return ans;
    // }

    // public int findendindex(int[] arr, int target) {
    // int start = 0;
    // int i = -1;
    // int end = arr.length - 1;
    // System.out.println("this is end index");

    // while (start <= end) {
    // int mid = start + (end - start) / 2;
    // if (arr[mid] >= target) {
    // end = mid - 1;
    // } else {
    // start = mid + 1;
    // }

    // if (arr[mid] == target) {
    // i = mid;
    // start = mid + 1;

    // }
    // }

    // return i;
    // }

    // public int findstartindex(int[] arr, int target) {
    // System.out.println("this is start index ");
    // int start = 0;
    // int i = -1;
    // int end = arr.length - 1;

    // while (start <= end) {
    // int mid = start + (end - start) / 2;
    // if (arr[mid] >= target) {
    // end = mid - 1;
    // } else {
    // start = mid + 1;
    // }

    // if (arr[mid] == target) {
    // System.out.println("this is returning start index mid");
    // i = mid;
    // end = mid - 1;

    // }
    // }

    // return i;
    // }

    // int search(int[] arr, int target, boolean findstartindex) {
    // int start = 0;
    // int end = arr.length - 1;
    // int mid = (start + end) / 2;

    // while (start <= end) {

    // mid = (start + end) / 2;

    // if (target < arr[mid]) {
    // end = mid - 1;
    // }
    // if (target > arr[mid]) {
    // start = mid + 1;
    // } else {
    // return mid;
    // }
    // if (findstartindex) {
    // end = mid - 1;
    // } else {
    // start = mid + 1;
    // }
    // }

    // return mid;
    // }

}
