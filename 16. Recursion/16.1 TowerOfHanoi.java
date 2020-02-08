public static List<Stack> getHanoi(List<Stack<Integer>> stacks, int n)
{
	getHanoiIteration(0,1,2,stack,1);
	return stacks;
}

public static List<Stack<Integer>> getHanoiIteration(int start, int middle, int end, List<Stack<Integer>> stack, int n)
{
	if(n==0)
	return;
	getHanoiIteration(start,end,middle,n-1);
	stacks.get(end).add(stacks.get(start).pop());
	getHanoiIteration(middle,end,start,n-1);
}