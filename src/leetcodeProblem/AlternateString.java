package leetcodeProblem;

public class AlternateString {

    public String getAlternatedStrings(String word1, String word2) {
        char[] resultArray = new char[word1.length() + word2.length()];
        int index = 0;

        for (int i = 0; i < Math.max(word1.length(), word2.length()); i++) {
            if (i < word1.length()) {
                resultArray[index++] = word1.charAt(i);
            }
            if (i < word2.length()) {
                resultArray[index++] = word2.charAt(i);
            }
        }

        return new String(resultArray);
    }
}
