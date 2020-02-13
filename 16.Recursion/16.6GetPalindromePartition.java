public static List<List<String>> getPalindromeSubs(String input)
{
	List<List<String>> result = new ArrayList();
	for(int i=0; i< input.length(); i++)
	{
		getPalin(result, input, 0, 0, 0, new ArrayList());
	}
	return result;
}

public static void getPalin(List<List<String>> result, String input, int start, int end, int curLength, List<String> temp)
{
	if(curLength==input.length)
	{
		result.add(new ArrayList(temp));
		return;
	}
	for(int i= start; i <input.length(); i++)
	{
		if(isPalin(start, i, input))
		 {
		 	getPalin(result, input, i, end, curLength+ i-start -1, temp.add(input.substring(start, i+1)));
		 	temp.remove(temp.size()-1);
		 	}
	}
}