package src.main.BasicQuestions;

public class FindMaxMinElement {
    static void main() {
        int[] arr = {12,34,1,45,288};
        int max = arr[0];

        for(int i=0;i<arr.length;i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println("Max element is: "+max);

        int min = arr[0];
        for(int i=0;i<arr.length;i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println("Min element is: "+min);
    }
}
