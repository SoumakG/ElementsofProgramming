public static List<String> getParans(int n)
{
	List<String> result = new ArrayList<String>();
	getParans(n, result, "", 0, 0);
	return result;
}

public static void getParans(int n, List<String> result, String t, int left, int right)
{
	if(right == n)
	{
		result.add(t);
		return;
	}

	if(left<n)
		getParans(n, result, t+ ")", left + 1, right);

	if(left<right)
		getParans(n, result, t+"(", left, right+1);

}


///https://leetcode.com/problems/generate-parentheses/