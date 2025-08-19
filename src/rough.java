public class rough {

      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }
    class Solution {
        public boolean isPalindrome(ListNode head) {




            // Call the reverseHead method and compare it with the original head
            ListNode temp = head;
            ListNode reversedHead = reverseHead(temp);
            while (head != null && reversedHead != null) {
                if (head.val != reversedHead.val) {
                    return false;
                }
                head = head.next;
                reversedHead = reversedHead.next;
                System.out.println(reversedHead.val);
            }
            return true;
        }

        // This method should not be inside the palindrome check method
        public ListNode reverseHead(ListNode temp) {
            ListNode prev = temp;
            ListNode present = temp.next;
            ListNode next = null;

            while (present != null) {
                next = present.next;    // Store next node
                present.next = prev;    // Reverse the link
                prev = present;         // Move prev to the current node
                present = next;         // Move to the next node
            }
            return prev;  // Return the new head of the reversed list
        }

        public static void main(String[] args) {

        }
    }
}
