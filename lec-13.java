//encapsulation
package encapsulation;
class Demo{
	private int a = 5;
	private int b = 10;
	private int c = 15;
	private int d = 20;
	
	public int getA()
	{
		System.out.println("Value of A read");
		return this.a;
	}
	
	public void setA(int a)
	{
		if(a>100)
		{
			this.a = a;
			System.out.println("Value of A changed to:"+a);
			
		}
		else {
			System.out.println("Cannot set -value outside limits");
		}
	}
	
	public int getB()
	{
		System.out.println("Value of B read");
		return this.b;
	}
}

public class EncapsuleStudy {
	public static void main(String [] args) {
		Demo d = new Demo();
		System.out.println(d.getA());
		d.setA(100);
		System.out.println(d.getA());
	}

}
