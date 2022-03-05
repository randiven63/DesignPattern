package tnsif.c2tc.m07;

public class Singleton {
	public String str;
	public static Singleton getSingletonInstance()
	{
		Singleton instance=new Singleton();
		return instance;
	}
	private Singleton()
	{
			
	}
}
