public static Integer RPNexp(String exp)
{
	String[] symbols = exp.split(",");
	Stack result = new Stack<Integer>();
	for(String s: symbols)
	{
		
		if(s.length()==1 && "+-*/".contains(s.charAt(0)))
		{
			Integer a = result.pop();
			Integer b = result.pop();
			switch(s)
			{
				case '+': result.push( a + b); break;
				case '-': result.push(a-b); break;
				case '*': result.push(a*b); break;
				case '/': result.push(a/b); break;
				default: throw new IllegalArgumentException(s);
			}
			
		}
		else
		{
			result.add(s);
		}
	}
	return result.pop();
}