public class Infinitearray {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int target = 8;
        System.out.println(ans(arr, target));

    }

    static int ans(int[] arr, int target) {
        // first find the range nd start the box size of 2
        int start = arr[0];
        int end = arr[1];

        while (arr[end] < target) {
            int newStart = end + 1;
            // newend = end + size of box*2;
            int newEnd = (end + (end - start + 1)) * 2;
            start = newStart;
            end = newEnd;
        }
        return BinerySeach(arr, target, start, end);
    }

    public static int BinerySeach(int[] arr, int target, int start, int end) {

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;

    }

}
