class Solution {
    // Function to remove duplicates from sorted linked list.
    Node removeDuplicates(Node head) {
        // Your code here
        Node cur= head;
        while(cur !=null && cur.next!= null){
            if(cur.data==cur.next.data){
                cur.next=cur.next.next;
            }
            else{
                cur=cur.next;
            }
        }
        return head;   
    }
}
