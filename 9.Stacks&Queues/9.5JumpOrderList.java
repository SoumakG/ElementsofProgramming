public static void setJumpOrderRecurse(PostingListNode l)
{
	setJumpOrderRecurse(l,0);
}
public static int setJumpOrderRecurse(PostingListNode l, int order)
{
	if(l!=null && l.order== -1)
	{
		l.order = order++;
		order = setJumpOrderRecurse(l.jump, order);
		order = setJumpOrderRecurse(l.next, order);
	}	
	return order;
}


public static void setJumpOrderIter(PostingListNode l)
{
	PostingListNode head = l;
	int curOrder = 0;
	Stack<PostingListNode> stack = new Stack();
	stack.add(head);
	PostingListNode cur = null;

	while(!stack.isEmpty())
	{
		cur = stack.pop();
		
		if(cur!=null&&cur.order==-1)
		{
			cur.order = curOrder++;
			stack.add(cur.jump);
			stack.add(cur.next);
		}
	}
}