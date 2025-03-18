class Solution {
    // Function to remove a loop in the linked list.
    public static void removeLoop(Node head) {
        if (head == null || head.next == null) return; // Edge case: empty list or single node
        
        Node slow = head, fast = head;

        // Step 1: Detect Loop
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) { // Loop detected
                break;
            }
        }

        // If no loop is found, return without modifying the list
        if (slow != fast) return;
        
        // Step 2: Find the start of the loop
        slow = head;
        Node prev = null; // This will store the last node before the loop
        
        if (slow == fast) {
            // Special case: If the loop starts at head, find the last node of the loop
            while (fast.next != slow) {
                fast = fast.next;
            }
            fast.next = null; // Break the loop
            return;
        }
        
        while (slow != fast) {
            prev = fast;  // Track the node before the loop start
            slow = slow.next;
            fast = fast.next;
        }
        
        // Step 3: Find the last node in the cycle
        while (prev.next != slow) {
            prev = prev.next;
        }
        
        // Step 4: Remove the loop
        prev.next = null;
    }
}
