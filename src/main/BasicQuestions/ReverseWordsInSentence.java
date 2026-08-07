package src.main.BasicQuestions;

//Program to reverse the order of words in a sentence
//EG: Original - I love Java , Rev - Java love I
public class ReverseWordsInSentence {

    static void main() {

        //using split() method from String class which
        // takes input as a string and returns an array of String
        String sentence = "I love Java";
        System.out.println("Original sentence: "+sentence);
        System.out.print("Reversed sentence: ");
        String[] words = sentence.split(" ");
        for(int i=words.length-1;i>=0;i--){
            System.out.print(words[i]+" ");
        }
    }
}
