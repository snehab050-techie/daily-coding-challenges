package src.main.BasicQuestions;

public class ReverseAnArrayUsingRecursion {

    static void reverse(int[] arr, int start, int end) {

        // Base condition
        if (start >= end) {
            return;
        }

        // Swap first and last elements
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        // Recursive call
        reverse(arr, start + 1, end - 1);
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        reverse(arr, 0, arr.length - 1);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
