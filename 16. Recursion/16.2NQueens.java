List<List<Integer>> getNQueens(int N)
{
	List<List<Integer>> result = new Arraylist();

	 getNQueensHelper(result,new ArrayList(),N);
	 return results;
}

public static void getNQueensHelper(List<List<Integer>> result,List<Integer> temp,int N)
{
	if(temp.size()==N) { result.add(new ArrayList(temp)); return;}

	for(int i=1; i<=N; i++)
	{
		temp.add(i);
		if(isValid(temp))
			getNQueensHelper(result,temp,N);

		temp.remove(temp.size()-1);
	}
}

public static booleanisValid(List<Integer> t)
{
	for(int i=0; i<t.size();i++)
	{
		for(int j=i+1; j<t.size();j++)
		{
			if(t.get(i)==t.get(j)|| ((j-i)==Math.abs(t.get(i)-t.get(j))))
			return false;
		}
	}
	return true;
}