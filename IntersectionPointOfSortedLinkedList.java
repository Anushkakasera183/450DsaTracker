class Solution {
    public static Node findIntersection(Node head1, Node head2) {
        // code here.
        Node temp1= head1;
        Node temp2= head2;
        if (head1 == null || head2 == null) return null;
        HashSet<Integer> hs = new HashSet<>();
        while(temp1!= null){
            hs.add(temp1.data);
            temp1= temp1.next;
        }
        Node dummy = new Node(0);
        Node tail = dummy;
        while(temp2!= null){
            if(hs.contains(temp2.data)){
                //
                tail.next = new Node(temp2.data);
                tail = tail.next;
                hs.remove(temp2.data); 
                
            }
            temp2= temp2.next;
        }
        return dummy.next;
    }
}
