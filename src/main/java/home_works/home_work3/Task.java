package home_works.home_work3;

public class Task {

    public boolean isAnagram(String s, String t) {
        if (s.length() == t.length()) {
            for (int i = 0; i < s.length(); i++) {
                String check = String.valueOf(t.charAt(i));
                if (s.contains(check)) {
                    for (int k = 0; k < t.length(); k++) {
                        int firstCount = s.length() - s.replace(check, "").length();
                        int secondCount = t.length() - t.replace(check, "").length();
                        if (firstCount != secondCount) return false;
                    }
                } else return false;
            }
        } else return false;
        return true;
    }
}
