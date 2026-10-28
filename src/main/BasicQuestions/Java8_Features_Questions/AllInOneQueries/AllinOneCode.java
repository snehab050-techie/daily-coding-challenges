package src.main.BasicQuestions.Java8_Features_Questions.AllInOneQueries;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AllinOneCode {
    static void main() {

        /* 1. Find all even numbers from a List<Integer>
        2. Find all odd numbers from a List<Integer>
        3. Find numbers greater than 10
        4. Find numbers divisible by 5
        5. Square every number using map()*/

        List<Integer> nums = Arrays.asList(12,45,68,90,23,5,8,3,44,68,82,35);

        nums.stream()
                .filter(num -> num % 2 == 0)
                .forEach(System.out::println);

        nums.stream()
                .filter(num -> num % 2!=0 )
                .forEach(System.out::println);

        nums.stream()
                .filter(n -> n > 10)
                .forEach(System.out::println);

        nums.stream()
                .filter(n -> n % 5 == 0)
                .forEach(System.out::println);

        nums.stream()
                .map(n-> n * 2)
                .forEach(System.out::println);

       /* 6. Convert a List<String> to uppercase
        7. Convert a List<String> to lowercase
        8. Find the count of elements using count()
        9. Find the maximum number using max()
        10. Find the minimum number using min()*/

        List<String> names = Arrays.asList("sneha","suhas","janu","alis","mark");
        names.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);

        names.stream()
                .map(String::toLowerCase)
                .forEach(System.out::println);

        Long cont = names.stream()
                .count();

        Integer maxNum = nums.stream()
                .max(Integer::compare)
                .orElseThrow();

        Integer minNUm = nums.stream()
                .min(Integer::compare)
                .orElseThrow();

       /* 11. Find the sum of all numbers using sum()
        12. Sort numbers in ascending order
        13. Sort numbers in descending order
        14. Remove duplicate elements using distinct()
        15. Print each element using forEach()*/

        Integer resSum = nums.stream()
                .reduce(Integer::sum)
                .orElseThrow();

        nums.stream()
                .sorted()
                .forEach(System.out::println);

        nums.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

        nums.stream()
                .distinct()
                .forEach(System.out::println);

        nums.forEach(System.out::println);

        /*16. Find duplicate numbers in a List
        17. Find unique numbers in a List
        18. Find the first non-repeated character in a String
        19. Find the first repeated character in a String
        20. Count the frequency of each character*/

        System.out.println("-----------------");

        List<Integer> numbers = Arrays.asList(10,34,56,78,92,30,56,10,92);

        Map<Integer, Long> map = numbers.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() >= 2)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        map.forEach((num, count) -> System.out.println(num +" - "+count));

        System.out.println("---------unique numbers");

        numbers.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue))
                .forEach((num, count) -> System.out.println(num+" - "+count));

        // find first non-repeated character in a string
        System.out.println("-------------");

        String str = "swiss";

        Character fnrch = str.chars()
                .mapToObj(c -> (char) c)
                .filter(ch -> str.indexOf(ch) == str.lastIndexOf(ch))
                .findFirst()
                .orElseThrow();

        System.out.println(fnrch);

        System.out.println("--------------");
        //first repeated character in a string
        Character frch =  str.chars()
                .mapToObj(c -> (char)c)
                .filter(ch -> str.indexOf(ch) != str.lastIndexOf(ch))
                .findFirst()
                .orElseThrow();

        System.out.println(frch);

        //count the freq of each character in a string
        System.out.println("----------------");
        String word = "apple";

        Map<Character, Long> charCount = word.chars()
                .mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        charCount.forEach((ch, count) -> System.out.println(ch+" - "+count));

       /* 21. Count the frequency of each word in a sentence
        22. Find duplicate characters in a String
        23. Find the frequency of each number using groupingBy()
        24. Find the second-highest number in a List
        25. Find the second-lowest number in a List*/

        System.out.println("-------------");

        String sentence = "Hey I love java java programming";

        Map<String, Long> rmap = Arrays.stream(sentence.split(" "))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        rmap.forEach((w,c) -> System.out.println(w+" - "+c));

        System.out.println("-----------------");

        String name = "swiss";

        // duplicate characters with count
        name.chars()
                .mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() >= 2)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue))
                .forEach((ch, count)-> System.out.println(ch+" - "+count));

        // only printing duplicate character
        name.chars()
                .mapToObj(c -> (char)c)
                .filter(ch -> str.indexOf(ch) != str.lastIndexOf(ch))
                .distinct()
                .forEach(System.out::println);

        //find the freq of each number using grouping by
        System.out.println("-------------");
        List<Integer> n = Arrays.asList(10,20,56,30,10,20,45,78,56,10);
        n.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue))
                .forEach((num, count) -> System.out.println(num+" - "+count));

        System.out.println("------------");

        Integer res = n.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElseThrow();

        System.out.println(res);

        System.out.println("--------------");

        Integer sln = n.stream()
                .distinct()
                .sorted()
                .skip(1)
                .findFirst()
                .orElseThrow();

        System.out.println(sln);
/*
        26. Find the longest String in a List
        27. Find Strings starting with a particular letter
        28. Sort Strings alphabetically
        29. Sort Strings by their length
        30. Check whether two Strings are anagrams using Streams*/

        System.out.println("-------------26----");
        List<String> longStr = Arrays.asList("hey","I","programming","love","parallel","like");
        Map<String, Integer> strlen = longStr.stream()
                .collect(Collectors.toMap(Function.identity(), String::length));

//        strlen.forEach((key, value) -> System.out.println(key+" - "+value));

        Map.Entry<String, Integer> en = strlen.entrySet()
                .stream()
                .max(Comparator.comparingInt(Map.Entry::getValue))
                .orElseThrow();

        System.out.println(en);

        List<String> famNames = Arrays.asList("hey","I","programming","love","parallel","like");

        System.out.println("-----27---");
        Set<String> s = famNames.stream()
                .filter(st -> st.startsWith("p"))
                .collect(Collectors.toSet());

        System.out.println(s);

        System.out.println("-----28------");
        String s1 = "apple";

        String emp = "";
        s1.chars()
                .mapToObj(c -> (char) c)
                .sorted()
                .map(ch -> emp + ch)
                .forEach(System.out::print);

        System.out.println("------28------sort strings alphabetically using a list of stings");
        famNames.stream()
                .sorted()
                .forEach(System.out::println);

        System.out.println("-----29---sort strings by their length");
        List<String> orginalList = Arrays.asList("Sneha","hey","program","dreams","I","yo");
        orginalList.stream()
                .sorted(Comparator.comparingLong(String::length))
                .forEach(System.out::println);

        System.out.println("-------------30---check whether two strings are anagrams using streams");
        String str1 = "Silent";
        String str2 = "Listen";
    }
}
