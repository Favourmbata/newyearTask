package tdd;

import leetcodeProblem.MaximumProduct;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MaximumProductTest {
    MaximumProduct maximumProduct = new MaximumProduct();
    @Test
    void maximumProduct_OfTwoInteger(){
        int [] input = {-10,-3,5,6,2};
        int [] output = {-10,-3};
        int []result = maximumProduct.getMaximumProduct(input);
        assertArrayEquals(output,result);
    }
}
