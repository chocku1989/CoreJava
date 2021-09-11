package development;

public class TestConst {
	
	public String a="init";
	TestConst(){
		//this("paraconsutcorcalled from Main");
		System.out.println("constructiore cll"+a);
		a="changed";
		System.out.println("constructiore cll"+a);
	}
	
	TestConst(String test){
		this();//can call the default constrcutor
		a="changedagain";
		System.out.println("constructiore cll"+test+a);
		
	}
//	
//	public void TestCon(String test){
//		
//		System.out.println(test+this.a);
//		
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestConst test = new TestConst();
		
System.out.println("main method" +test.a);

TestConst test1 = new TestConst("paramecons");
System.out.println("main method" +test1.a);
//test.TestCon("method");

	}

}
