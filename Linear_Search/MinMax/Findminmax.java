package Linear_Search.MinMax;

import java.util.Arrays;
import java.util.Scanner;

public class Findminmax {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("enter the size of array :  ");
        int size = inp.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements to put in array");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = inp.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        Minmax(arr);
        inp.close();

    }

       static void Minmax(int[] arr) {
        int min = 0;
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            if( arr[i] > max){
                max = arr[i];
            }
            if( arr[i]< min){
                min = arr[i];
            }
        }
        System.out.println(" Min :"+ min +" Max :"+ max);
    }
    
}
