package home_works.home_work6.task1;

public class Solution {
    public boolean isPalindrome(String word) {
        String removeSymbols = word.replaceAll("\\W","").replace("_","").toLowerCase();
        StringBuilder stringBuilder = new StringBuilder(removeSymbols);
        return removeSymbols.equals(stringBuilder.reverse().toString());
    }
}
