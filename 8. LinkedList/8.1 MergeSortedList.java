public static ListNode<Integer> mergeSorted(ListNode<Integer> l1, ListNode<Integer> l2)
{
	if(l1==null || l2==null)
	 return l1==null?l2:l1;

	ListNode<Integer> dummyhead = new ListNode<Integer>(0,null);
	ListNode<Integer> head = dummyHead;
	while(l1!=null&l2!=null)
	{
		if(l1.val>l2.val)
		 {
		 	head.next= l2;
		 	l2 = l2.next;	 	
		 }
		 else
		 {
		 	head.next = l1;
		 	l1 = l1.next;
		 }
		 head = head.next;
	}
	if(l1==null || l2==null)
	{
	 head.next = l1==null? l1:l2;
	}
	return dummyHead.next;

}