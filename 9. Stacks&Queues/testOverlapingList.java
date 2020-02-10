public static ListNode getOverlapNode(ListNode head1, ListNode head2)
{
	ListNode tail1 = head1;
	ListNode tail2 = head2;
	int list1Length = 0, list2Length = 0;

	while(tail1.next!= null)
	{
		tail1 = tail1.next;
		list1Length++;
	}
	while(tail2.next)
	{
		tail2 = tail2.next;
		list2Length++;
	}

	if(tail1!= tail2) return null;

	ListNode trailingNode = list1Length > list2Length ? head1: head2;
	ListNode leadingNode = list1Length > list2Length ? head2: head1;
	int trailingDistance = Math.abs(list1Length - list2Length);
	while(trailingDistance-->0) trailingNode = trailingNode.next;
	
	while(leadingNode!= trailingNode)
	{
		leadingNode = leadingNode.next;
		trailingNode = trailingNode.next;
	} 
	return leadingNode;
}