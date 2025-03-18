public class Solution {
	public static  Node delAddLastNode(Node head) {
		// Write your code here.
        if (head ==null|| head.next==null)
        return head;
        Node temphead= head;
        Node prev= head;
        while(temphead.next!= null){
            prev= temphead;
            temphead= temphead.next;
        }
        temphead.next= head;
        head= temphead;
        prev.next= null;
        return head;
	}
}
