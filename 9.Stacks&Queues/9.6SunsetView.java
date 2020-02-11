public class BuildingWithHeight
{
	int id;
	int height;
	public BuildingWithHeight(int id, int height)
	{
		this.id = id;
		this.height = height;
	}
}

public static Stack<BuildingWithHeight> getBuildingSunset(List<BuildingWithHeight> list, Iterator<BuildingWithHeight> sequence)
{
	Stack<BuildingWithHeight> stack = new Stack();
	stack.add(sequence.next());
	List<Integer> ids = new ArrayList();
	while(sequence.hasNext())
	{
		BuildingWithHeight cur.height = sequence.next();
		while(!stack.isEmpty()&& stack.peek().height< cur.height)
		 stack.pop();

		stack.push(cur);
	}
	return stack;
}