public class Vowels {
    public static void main(String[] args) {

        String input = "precious";
        String resultString = vowels(input);
        System.out.println(resultString);
    }

    private static String vowels(String input) {
        String result = "";

        for (char charArr : input.toCharArray()) {
            if (isVowel(charArr)) {
                result += charArr;
            }
        }

        return result;
    }

    private static boolean isVowel(char ch) {
        return "bcdfghjklmnpqrstvwxyz".indexOf(ch) != -1;
    }
    }






//