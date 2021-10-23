package Object;

public class Book2 {
	int id;
	Book2(int id)
	{
		this.id=id;
		
	}

	public static void main(String[] args) {
		Book2 b1=new Book2(100);
		Book2 b2=new Book2(100);
		System.out.println(b1.hashCode()==b2.hashCode());
		System.out.println(b1.equals(b2));

	}
	public boolean equals(Object o)
	{
		if(this.id==((Book2)o).id)
		{
			return true;
		}
		else
			return false;

	
	
}
	public int hashCode()
	{
		return id;
	}
	public String toString()
	{
		
		return "book2 id is:"+id;
	}

	
}
