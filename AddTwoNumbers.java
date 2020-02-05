/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode  newNode = null;
        ListNode  tempNode = null;
        ListNode  headNode = null;
        int count = 0, sum = 0;
        int borrowDigit =0;
        while(l1 != null || l2 != null){
            count++;
            sum = borrowDigit ;
            if(l1!=null)
			{
				sum=sum+l1.val;
				l1=l1.next;
			}
 
			if(l2!=null)
			{
				sum=sum+l2.val;
				l2=l2.next;
			}
             borrowDigit = sum / 10;
             int value = sum % 10 ;
 
            System.out.println(value);
          
            if(count ==1){
                newNode =  new ListNode(value);
                headNode = newNode;
                
            }
            else { 
            tempNode = new ListNode(value);
            newNode.next = tempNode;
            newNode = newNode.next;
   
            }
            
        if(borrowDigit!=0){
			ListNode tempCarryNode = new ListNode(borrowDigit);
			newNode.next=tempCarryNode;
		}
            
            
        }
        return headNode;
        
    }
}
