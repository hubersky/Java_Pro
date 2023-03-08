package home_works.home_work3;

public class Task {

    public boolean isAnagram(String s, String t) {
        if (s.length() == t.length()) {
            for (int i = 0; i < s.length(); i++) {
                String check = String.valueOf(t.charAt(i));
                if (s.contains(check)) {
                    int firstCount = 0;
                    int secondCount = 0;
                    for (int k = 0; k < t.length(); k++) {
                        String firstCheck = String.valueOf(t.charAt(k));
                        String secondCheck = String.valueOf(s.charAt(k));
                        if (check.equals(secondCheck)) firstCount++;
                        if (firstCheck.equals(check)) secondCount++;
                    }
                    if (firstCount != secondCount) return false;
                } else {
                    return false;
                }
            }
        } else {
            return false;
        }
        return true;
    }
}
