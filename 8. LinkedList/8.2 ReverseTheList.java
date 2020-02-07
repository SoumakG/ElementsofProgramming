//Write a program which takes a singly linked list L and two integers s and f as
//arguments, and reverses the order of the nodes from the sth node to fth node,
//inclusive. The numbering begins at 1, i.e., the head node is the first node. Do not
//allocate additional nodes.
public static ListNode getReverse(ListNode head, int s, int f)
{
	ListNode dummyHead = head;
	int start = 1
	while(start++<s)
		dummyHead = dummyHead.next;
	ListNode sNode = dummyHead.next;
	while(start<f)
	{
		ListNode temp = dummyHead.next;
		dummyHead.next = sNode.next;
		ListNode sNext = sNode.next;
		sNode.next.next = temp;
		sNode.next = sNext;
		start++;
	}
	return head;

}


dh sn 1 2 f
	t 	sN
dh 1  