package home_works.home_work6.task1;

public class Solution {
    public boolean isPalindrome(String word) {
        String removeSymbols = word.replaceAll("\\W","").replace("_","").toLowerCase();
        StringBuilder reverseWord = new StringBuilder(removeSymbols);
        return removeSymbols.equals(reverseWord.reverse().toString());
    }
}
