package home_works.home_work_15;

public class MaximumNumberOfBalloons {

    public int maxNumberOfBalloons(String text) {
        char[] symbols = text.toCharArray();
        int b = 0;
        int a = 0;
        int l = 0;
        int o = 0;
        int n = 0;
        int result = 0;
        for (char type : symbols) {
            switch (type) {
                case 'b' -> b++;
                case 'a' -> a++;
                case 'l' -> l++;
                case 'o' -> o++;
                case 'n' -> n++;
            }
        }
        while (true) {
            if (b >= 1 & a >= 1 & l >= 2 & o >= 2 & n >= 1) {
                result++;
                b--;
                a--;
                l -= 2;
                o -= 2;
                n--;
            } else break;
        }
        return result;
    }
}
