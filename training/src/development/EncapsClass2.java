package development;

public class EncapsClass2 {
public static void main(String[] args) {
	EncapsClass1 e = new EncapsClass1();
	System.out.println(e.getId());
	System.out.println(e.getName());
	
	e.setId(2);
	e.setName("Test");
	
	System.out.println(e.getId());
	System.out.println(e.getName());
	
	e.setId1(-101);
	e.setName1("Test1");
	
	System.out.println(e.getId1());
	System.out.println(e.getName1());
}
}
