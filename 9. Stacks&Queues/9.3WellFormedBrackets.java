public static boolean wellFormed(String brackets)
{
	Stack<Character> stack = new Stack<Character>();
	for(int i =0; i < brackets.length(); i++)
	{
		if("{([".contains(brackets.charAt(i)))
		{
			stack.push(brackets.charAt(i));
		}
		else
		{ if(stack.isEmpty()) return false;
			switch(brackets.charAt(i))
			{
				case ')': if(stack.pop()!= '(') return false; break;
				case '}': if(stack.pop()!= '{') return false; break;
				case ']': if(stack.pop()!= '[') return false; break;
				default: return false; break;
			}
		}
	}
	return stack.isEmpty();
}