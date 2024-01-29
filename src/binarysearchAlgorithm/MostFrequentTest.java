package binarysearchAlgorithm;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MostFrequentTest {
    MostFrequent frequentNumber = new MostFrequent();

    @Test
    void mostFrequentNumber(){
        int [] input = {2,1,1,2,2};
        int [] output = {2};
        int [] result = frequentNumber.getFrequentNumber(input);
        System.out.println(Arrays.toString(result));
        assertArrayEquals(output,result);

    }

  @Test
    void mostFrequentNumber_Two(){
      int [] input = {4,1,5,5};
      int [] output = {5};
      int [] result = frequentNumber.getFrequentNumber(input);
      System.out.println(Arrays.toString(result));
      assertArrayEquals(output,result);
  }

}
