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
class Solution {
    public boolean isPalindrome(ListNode head) {
        List<Integer> original = new ArrayList<>();
        ListNode temp = head;
        while(temp != null){
            original.add(temp.val);
            temp = temp.next;
        }
        ListNode prev = null;
        ListNode ptr = head;
        while(ptr != null){
            ListNode nextNode = ptr.next;
            ptr.next = prev;
            prev = ptr;
            ptr = nextNode;
        } 
        ListNode reversedPtr = prev;
        for(int i = 0; i<original.size(); i++){
            if(reversedPtr.val != original.get(i)){
                return false;
            }
            reversedPtr = reversedPtr.next;
        }
        return true;
    }
}