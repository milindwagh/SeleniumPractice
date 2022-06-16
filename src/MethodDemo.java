import io.netty.util.internal.SystemPropertyUtil;

public class MethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodDemo d = new MethodDemo();
		String name = d.getData();
		System.out.println(name);
		
		MethodDemo2 d2 = new MethodDemo2();
		d2.getData2();
		
		getData3();

	}
	
	public String getData()
	{
		System.out.println("Hellow World");
		return "Milind Wagh";
	}
	
	public static String getData3()
	{
		System.out.println("Hello World3");
		return null;
	}

}
