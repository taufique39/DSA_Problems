/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */


 // By using Linked List
// class Solution {
//     public ListNode swapPairs(ListNode head) {
//         ListNode dummy = new ListNode(-1);

//         dummy.next = head;
//         ListNode p = dummy;

//         while(head != null && head.next != null){
//             //swap
//             ListNode first = head;
//             ListNode second = head.next;

//             first.next = second.next;
//             second.next = first;
//             p.next = second;

//             p = first; 
//             head = first.next;
//         }
//         return dummy.next;
//     }
// }


//By using Recursion :-
class Solution{
    public void swapPairsHelper(ListNode prev, ListNode curr){
        if(curr == null || curr.next == null){
            return;
        }

        ListNode first = curr;
        ListNode second = curr.next;

        first.next = second.next;
        second.next = first;
        prev.next = second;

        swapPairsHelper(first, first.next);
    }
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(-1);

        dummy.next = head;
        ListNode p = dummy;

        swapPairsHelper(p, head);

        return dummy.next;
    }
}