package leetcodeProblem;

import java.util.ArrayList;
import java.util.List;
//
//public class MergeTwoList {
//    public static ListNode mergeListsArray(ListNode list1, ListNode list2) {
//        List<ListNode> mergedArray = new ArrayList<>();
//
//        while (list1 != null && list2 != null) {
//            if (list1.val < list2.val) {
//                mergedArray.add(list1);
//                list1 = list1.next;
//            } else {
//                mergedArray.add(list2);
//                list2 = list2.next;
//            }
//        }
//
//        // Append the remaining elements from either list
//        while (list1 != null) {
//            mergedArray.add(list1);
//            list1 = list1.next;
//        }
//
//        while (list2 != null) {
//            mergedArray.add(list2);
//            list2 = list2.next;
//        }
//
//        // Convert the array of nodes back to a linked list
//        ListNode dummy = new ListNode(0);
//        ListNode current = dummy;
//
//        for (ListNode node : mergedArray) {
//            current.next = node;
//            current = current.next;
//        }
//
//        return dummy.next;
//    }
//}
