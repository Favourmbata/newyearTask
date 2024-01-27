package leetcodeProblem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlternateStringTest {
    AlternateString alternateString = new AlternateString();
    @Test
    void alternateString(){
        String word1 = "abc";
        String word2 = "pqr";
        String output = "apbqcr";
        String result = alternateString .getAlternatedStrings(word1,word2);
        System.out.println(output);
        assertEquals(output,result);
    }

  @Test
    void alternateStringTwo(){
      String word1 = "abc";
      String word2 = "pqrs";
      String output = "apbqcrs";
      String result = alternateString .getAlternatedStrings(word1,word2);
      System.out.println(output);
      assertEquals(output,result);
  }

}
