package Object;

public class Book1
{
	


String title;
Book1(String title)
{
	this.title=title;
	
}

	public static void main(String[] args) {
		Book1 b1=new Book1("java");
		Book1 b2=new Book1("java");
		Book1 b3=b1;
		System.out.println(b1.hashCode()==b3.hashCode());
		//System.out.println(b1.equals(b2));
		

	}
	public boolean equals(Object o)
	{
		if(this.title==((Book1)o).title)
		{
			return true;
		}
		else
		return false;
	}

}
