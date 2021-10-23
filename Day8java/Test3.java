package Object;

public class Test3
{
	int a=10;
	int b=20;
	

	public static void main(String[] args)
	{
		Test3 t=new Test3();
		Test3 t2=new Test3();
		System.out.println(t);
		System.out.println(t.toString());
		System.out.println(t.equals(t2));
		}
	@Override
	public String toString()
	{
		return ""+"a = " + a + "b = " + b;
	}
	

}
