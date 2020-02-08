///Write a function that takes as input a set and returns its power set.
List<List<Integer>> getPowerSet(List<Integer> input)
{
	List<List<Integer>> result = new ArrayList();
	getPower(result, input, new ArrayList(), 0);
	return result;
}

public static void getPower(List<List<Integer>> result, List<Integer> input, List<Integer> t, int i)
{
	if(i==input.size())
	return;
	result.add(new ArrayList(t));
	for(int j=i; j<input.size(); j++)
	{
		t.add(input.get(j));
		getPower(result,input,t,j+1);
		t.remove(t.size()-1);
	}
}

//https://leetcode.com/problems/subsets/