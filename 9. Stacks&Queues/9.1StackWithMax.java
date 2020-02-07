///Design a stack that includes a max operation, in addition to push and pop. The max
///method should return the maximum value stored in the stack.

#include java.util.*;
class MaxWithCount
{
	int max;
	int count;
	MaxWithCount(int max, int count)
	{
		this.max = max;
		this.count = count;

	}

}
class StackWithMax 
{
	Stack<Integer> values = new Stack();
	Stack<Integer> max = new Stack();

	void push(int i)
	{
		values.add(i);
		if(max.isEmpty())
		{
			max.add(i);
		}
		else
		{
			if(max.peek()<i)
			{
				max.add(new MaxWithCount(i,1));
			}
			else if()
			{

			}
		}

	}
}