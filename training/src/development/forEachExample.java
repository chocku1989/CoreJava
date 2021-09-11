package development;

public class forEachExample {

public static void main(String[] args) {
	

	int [] a = {4,5,6};
	
	for(int var:a) {
		
		System.out.println(var);
	}
	
	int d=9;
	System.out.println(d==9?"equal":"notequals");
	
	System.out.println(d==5?"equal":(d==6?"equals 6":"not equal to 6 also") );
	
}
}
