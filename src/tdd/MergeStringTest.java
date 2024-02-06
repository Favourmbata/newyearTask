//package tdd;
//
//import leetcodeProblem.ListNode;
//import leetcodeProblem.MergeString;
//import org.junit.jupiter.api.Test;
//
//import java.util.Arrays;
//
//import static org.junit.jupiter.api.Assertions.assertArrayEquals;
//
//public class MergeStringTest {
//    MergeString mergeString = new MergeString();
//
//    @Test
//    void mergingOfStrings(){
//        ListNode input1 = ListNode.createLinkedList(new int[]{1,2,4});
//        ListNode input2 = ListNode.createLinkedList( new int[]{1, 3, 4});
//        int [] output = {1,1,2,3,4,4};
//        ListNode result = mergeString.mergeListsList(input1, input2);
//        int[] resultArray = ListNode.convertToArray(result);
//
//        assertArrayEquals(output,resultArray);
//    }
//}
