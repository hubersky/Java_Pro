package home_works.home_work12;

class Solution {
    public int romanToInt(String s) {
        String[] romanNumerals = s.split("");
        int result = 0;
        if (s.length() > 1) {
            for (int i = 0; i < romanNumerals.length; i++) {
                String numeral = romanNumerals[i] + romanNumerals[i + 1];
                switch (numeral) {
                    case "IV" -> {
                        result += 4;
                        romanNumerals[i] = "";
                        romanNumerals[i + 1] = "";
                    }
                    case "IX" -> {
                        result += 9;
                        romanNumerals[i] = "";
                        romanNumerals[i + 1] = "";
                    }
                    case "XL" -> {
                        result += 40;
                        romanNumerals[i] = "";
                        romanNumerals[i + 1] = "";
                    }
                    case "XC" -> {
                        result += 90;
                        romanNumerals[i] = "";
                        romanNumerals[i + 1] = "";
                    }
                    case "CD" -> {
                        result += 400;
                        romanNumerals[i] = "";
                        romanNumerals[i + 1] = "";
                    }
                    case "CM" -> {
                        result += 900;
                        romanNumerals[i] = "";
                        romanNumerals[i + 1] = "";
                    }
                }
                if (i + 1 == romanNumerals.length - 1) {
                    break;
                }
            }
        }
        for (String numeral : romanNumerals) {
            switch (numeral) {
                case "I" -> result += 1;
                case "V" -> result += 5;
                case "X" -> result += 10;
                case "L" -> result += 50;
                case "C" -> result += 100;
                case "D" -> result += 500;
                case "M" -> result += 1000;
            }
            if (romanNumerals.length == 1) {
                break;
            }
        }
        return result;
    }
}


