package tdd;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class CountFrequencyTest {
    CountFrequency countFrequency = new CountFrequency();

    @Test
    void countNumberOfFrequency(){
        int []input = {1, 2, 8, 3, 2, 2, 2, 5, 1};
        int [] output = {1,2};
        int [] result = countFrequency.getFrequentNumber(input);
        System.out.println(Arrays.toString(result));
        assertArrayEquals(output,result);
    }

    @Test
            void frequentNumber(){
    int []input = {2,1,1,2,1};
    int [] output = {2};
    int [] result = countFrequency.getFrequentNumber(input);
       assertArrayEquals(output,result);
}

}
