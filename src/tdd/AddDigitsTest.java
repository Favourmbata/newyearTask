package tdd;

import binarysearchAlgorithm.AddDigits;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AddDigitsTest {
    AddDigits addDigits = new AddDigits();
    @BeforeEach
    void setUp() {
    }

 @Test
    void addAllDigits_TillItsOne(){
        int  input = 56;
        int output = 2;
        int result = addDigits.getAddedDigit(input);
        assertEquals(output,result);
 }
}