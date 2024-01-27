import leetcodeProblem.PlusOne;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class PlusOneTest {
    PlusOne addingToArray = new PlusOne();
    @Test
    public void addingPlusOneToArray1(){
        int [] input = {1,2,7};
        int [] output = {1,2,8};
        int [] result = addingToArray .getAdditionalElement(input);
        System.out.println(Arrays.toString(result));
        assertArrayEquals(output,result);
    }
   @Test
  void addingPlusOneTo_AnotherArray2(){
       int [] input = {4,3,2,1};
       int [] output = {4,3,2,2};
       int [] result = addingToArray .getAdditionalElement(input);
       System.out.println(Arrays.toString(result));
       assertArrayEquals(output,result);
  }
   @Test
    void addingPlusOneTo_AnotherArray3(){
       int [] input = {8};
       int [] output = {9};
       int [] result = addingToArray .getAdditionalElement(input);
       System.out.println(Arrays.toString(result));
       assertArrayEquals(output,result);
   }

}
