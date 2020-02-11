public static String getPath(String s)
{
	Stack<String> stack = new Stack();
	String[] input = s.split("/");
	for(String si: input)
	{
		if(si == ".") continue;
		else if(si == "..")
		{
			if(!s.isEmpty())
			{
				stack.pop();
			}
			else throw new IllegalArgumentException("Invalid Path");
		}
		else
		{
			stack.push(si);
		}
	}
	StringBuilder sb = new StringBuilder();
	while(!stack.isEmpty())
	{
		sb.append("/");
		sb.append(stack.pop());
	}
	return sb.reverse().toString();
}