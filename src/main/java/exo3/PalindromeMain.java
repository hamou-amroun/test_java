package exo3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PalindromeMain {

    public static void main(String[] args) {

        int a = 9/2;
        System.out.println("a = " + a);

        List<String> palindromeList = new ArrayList<>();
        for (String word : getPalindromeList()) {
            if (hasAPalindrome(word)) {
                palindromeList.add(word);
            }
        }
        palindromeList.forEach(palindrome ->
                System.out.println(palindrome)
        );
    }

    private static boolean hasAPalindrome(String word) {
        word = word.replaceAll("\\s+", "").toLowerCase();
        int length = word.length();
        int forward = 0;
        int backward = length - 1;
        while (backward > forward) {
            char forwardChar = word.charAt(forward++);
            char backwardChar = word.charAt(backward--);
            if (forwardChar != backwardChar)
                return false;
        }
        return true;
    }

    private static List<String> getPalindromeList() {
        return Arrays.asList("hahahahah",
                "hahahahah",
                "Anna",
                "helloMan",
                "Civic",
                "bullShit",
                "Kayak",
                "WhereAreYou",
                "Level",
                "Sir",
                "Madam",
                "hahahahah",
                "Mom",
                "yes",
                "Noon",
                "notAPalindrome");
    }
}
