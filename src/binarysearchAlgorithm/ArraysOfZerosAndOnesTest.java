package binarysearchAlgorithm;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class ArraysOfZerosAndOnesTest {
    ArraysOfZerosAndOnes arraysOfZerosAndOnes = new ArraysOfZerosAndOnes();
    @Test
    void arraysOfZerosAndOnes(){
       int  [] input  =  {4,5,8,8,8,2,9};
       int  [] output =  {0,1,0,0,0,0,1};
       int [] result =  arraysOfZerosAndOnes.getZerosAndOne(input);
        System.out.println(Arrays.toString(result));
       assertArrayEquals(output,result);



    }

     @Test
    void returnAnArrayOfBool(){
         int  [] input  =  {4,5,8,8,8,2,9};
         boolean[]output = {false,true,false,false,false,false,true};
         boolean []result = arraysOfZerosAndOnes.getBooleanResult(input);
         System.out.println(Arrays.toString(result));
         assertArrayEquals(output,result);
     }


    @Test
    void returnDoubleElementInAnArray(){
        int []input = {4,5,8};
        int []output = {4,5,8,8,10,16};
        int []result = arraysOfZerosAndOnes.getDouleElementOfInput(input);
        System.out.println(Arrays.toString(result));
        assertArrayEquals(output,result);
    }
}
