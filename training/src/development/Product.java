package development;

public class Product {
	
	int i;
	public static int j;

	public static void main(String[] args) {
		Product p = new Product();
		
		System.out.println(p.i);
		System.out.println( new Product().i);
		System.out.println(new String().contains("555"));
		System.out.println(p.j);
		System.out.println( new Product().j);
	}
	
	static
	{
		Product p1 = new Product();
		System.out.println("ststaic method");
		System.out.println(p1.i=9);
		System.out.println(p1.j=10);
	}

}
