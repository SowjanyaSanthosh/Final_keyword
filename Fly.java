package javaprogram;
final class JavaProgram
{
	public void m1()
	{
		System.out.println("m1 method present in final class");
	}
}
public class Fly extends JavaProgram{
	public void m2()
	{
		System.out.println("m2 method present in child class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Fly f=new  Fly();
		 f.m1();
		 f.m2();
	}

}
