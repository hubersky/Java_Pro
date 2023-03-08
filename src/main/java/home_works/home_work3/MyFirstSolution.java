package home_works.home_work3;

public class MyFirstSolution {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        for (int i = 0; i < s.length(); i++) {
            String check = String.valueOf(t.charAt(i));
            if (!s.contains(check)) return false;
            for (int k = 0; k < t.length(); k++) {
                int firstCount = s.length() - s.replace(check, "").length();
                int secondCount = t.length() - t.replace(check, "").length();
                if (firstCount != secondCount) return false;
            }
        }
        return true;
    }
}
