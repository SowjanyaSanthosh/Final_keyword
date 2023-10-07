package javaprogram;
class Sample2
{
	public static final void m1()
	{
		System.out.println("m1 is present sample2 parent class");
	}
}

public class Final_Methods extends  Sample2{
	public static final void m1()
	{
		System.out.println("m is present Final_Methods child class");
	}

	public static void main(String[] args) {
		Final_Methods fm=new Final_Methods();
		fm.m1();

	}

}
