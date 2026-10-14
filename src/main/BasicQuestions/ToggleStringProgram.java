package src.main.BasicQuestions;// Toggle String program

public class ToggleStringProgram {
    static void main() {

        String str = "SNeHa";
        String empty = "";

        char[] arr = str.toCharArray();
        for(int i=0;i<=arr.length-1;i++){
            if(Character.isUpperCase(arr[i])){
                empty = empty + Character.toString(arr[i]).toLowerCase();
            }
            else{
                empty =empty + Character.toString(arr[i]).toUpperCase();
            }
        }

        System.out.println(empty);
    }
}
