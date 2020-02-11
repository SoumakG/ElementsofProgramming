public static ListNode testCycle(ListNode head)
{
	ListNode fast = head, slow = head;
	while(fast!=null&&fast.next!=null&&fast.data!=slow.data)
	{
		fast = fast.next.next;
		slow = slow.next;
	}
	if(fast==null||fast.next == null ||fast.data!=slow.data)
	{
		return null;
	}
	slow = slow.next;
	int cycleLength = 1;
	while(fast.data!= slow.data)
	{
		slow = slow.next;
		cycleLength++;
	}
	ListNode cycleStart = head;
	ListNode cycleEnd = head;
	while(cycleLength--!=0)
	cycleEnd = cycleEnd.next;

	while(cycleStart.data!= cycleEnd.data)
	{
		cycleStart = cycleStart.next;
		cycleEnd = cycleEnd.next;
	}
	return cycleStart;

}