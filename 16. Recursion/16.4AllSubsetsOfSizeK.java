public static void List<List<Integer>> getSubset(int n, int k)
{
	List<List<Integer>> result = new ArrayList();
	getSubsetHelper(result, new ArrayList(), 1, k, n);
	return result;
}
public static void getSubsetHelper(List<List<Integer>> result, List<Integer> t, int cur, int k, int n)
{
	if(t.size()==k)
	{
		result.add(new ArrayList(t));
		return;
	}
	final int remaining = k - t.size();
	for(int i = cur; i <= n && remaining <= n - i +1; i++)
	{
		t.add(i);
		getSubsetHelper(result, t, i+1, k, n);
		t.remove(t.size()-1);
	}
}

/* n- i -1 checks if its worth it to go forward with another iteration since the remaining elements are less than k */