package leetcodeProblem;
//    You are given the heads of two sorted linked lists list1 and list2.
//    Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
//    Return the head of the merged linked list.
//    example 1:
//    Input: list1 = [1,2,4], list2 = [1,3,4]
//    Output: [1,1,2,3,4,4]
//    Example 2:
//    Input: list1 = [], list2 = []
//    Output: []
//    Example 3:
//    Input: list1 = [], list2 = [0]
//    Output: [0]
//    Constraints:
//    The number of nodes in both lists is in the range [0, 50].
//            -100 <= Node.val <= 100
//    Both list1 and list2 are sorted in non-decreasing order.
public class MergeString {

    
    public ListNode mergeListsList(ListNode input1, ListNode input2) {
        if(input1 == null && input2 == null){
            return null;
        }else if(input1 == null){
            return input2;
        }else if(input2 == null){
            return input1;
        }

        if(input1.val > input2.val){
            ListNode temp = input1;
           input1 =  input2;
            input2 = temp;
        }

        ListNode head1 = input1, head2 = input2, previous = head1;

        while(head1 != null && head2 != null){
            if(head1 == null){
                previous.next = head2;
                head2 = null;
            }

            if(head1.val > head2.val){
                previous.next = head2;
                previous = head2;
                head2 = head2.next;
                previous.next = head1;
            }else{
                previous = head1;
                head1 = head1.next;
            }
        }

        if(head2 != null) previous.next = head2;

        previous = null;
        head2 = null;
        head1 = null;
       input2 = null;

        return input1;
}



}

