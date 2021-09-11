package development;

public class ExecuteMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Bank bk = new ICICI();
//		System.out.println(bk.balance); //this will still Point to bk referce, Praent cannot properties of Child, this is called Object Subsitrution
//		bk.Location();// But parent object  bk holds references of ICICI
//		new ICICI().WORKINGDAY();
//		
//		Bank bk1 = new Bank();
//		bk1.Location();
//		
//		ICICI ic = new ICICI();
//		//ic.balance=150;
//		System.out.println(ic.balance);
//		System.out.println(ic.balance);
		
		ICICI icObj = new ICICI();
		icObj.Location();
		
		
		
	}

}
