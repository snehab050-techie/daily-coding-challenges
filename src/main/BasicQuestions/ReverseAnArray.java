// Program to reverse a 1D array in Java

import java.util.Arrays;

public class ReverseAnArray {
    static void main() {

        int[] arr = {10,20,30,40,50};
        int[] s = new int[arr.length];
        int count = 0;
        for(int i= arr.length-1;i>=0;i--){
                s[count] = arr[i];
                count++;
        }
        System.out.println(Arrays.toString(s));
    }
}
