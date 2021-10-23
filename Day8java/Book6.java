package Object;

public class Book6 {

	public static void main(String[] args) {
		String s1,s2;
		s1=new String("demo");
		s2=s1;
		System.out.println(s1);
		System.out.println(s2);
		s1=s1.concat("test String");
		System.out.println("-------------");
		
		StringBuilder s3,s4;
		s3=new StringBuilder("sheela");
		s4=s3;
		System.out.println(s3);
		System.out.println("malla");
		System.out.println(s4);
	}

}
