package home_works.home_work3;

public class Main {
    public static void main(String[] args) {
        MyFirstSolution firstSolution = new MyFirstSolution();
        SecondSolutionWithoutTimeLimitExceeded secondSolution = new SecondSolutionWithoutTimeLimitExceeded();

        boolean firstResult = firstSolution.isAnagram("anagram", "nagaram");
        boolean secondResult = secondSolution.isAnagram("anagram", "nagaram");

        System.out.println(firstResult);
        System.out.println(secondResult);
    }
}
