package Linear_Search.FindElement;


public class standardquest {

    public static void main(String[] args) {
        int target = 12;

        int[] arr = {3,2,5,6,7,8,9,12};
        int ans = LinearSearch(target, arr);
         System.out.println(ans);
        }

        static int LinearSearch(int target, int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                if(target == arr[i]){
                    return i;
                }   
            }
        return -1;
    }
}

    

