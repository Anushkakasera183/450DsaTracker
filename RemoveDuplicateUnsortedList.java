class Solution {
    // Function to remove duplicates from unsorted linked list.
    public Node removeDuplicates(Node head) {
        // Your code here
        HashSet<Integer> hs= new HashSet<>();
        Node cur= head;
        Node prev= null;
        while(cur!= null){
            if(hs.contains(cur.data)){
                //duplicate is there 
                prev.next= cur.next;
            }
            else{
                hs.add(cur.data);
                prev= cur;
            }
            cur= cur.next;
        }
        return head;
    }}
