package development;

public class Productt {
	
	public int no;
	public String name;
	public Double cost;
	
	
	Productt(int no, String name, Double cost){
		this.no=no;
		this.name=name;
		this.cost=cost;
		
	}

	public int getNo() {
		return no;
	}

//	public void setNo(int no) {
//		this.no = no;
//	}

	public String getName() {
		return name;
	}

//	public void setName(String name) {
//		this.name = name;
//	}

	public Double getCost() {
		return cost;
	}

//	public void setCost(Double cost) {
//		this.cost = cost;
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Productt[] dummy=  new Productt[3];
		
		
		Productt prod1= new Productt(1, "SOAP" , 20d);
		Productt prod2 = new Productt(1, "TOWEL" , 30d);
		Productt prod3 = new Productt(1, "SHAMPOO" , 40d);
	
		dummy[0]=prod1;
		dummy[1]=prod2;
		dummy[2]=prod3;
		
		for (int i = 0; i < dummy.length; i++) {
			System.out.println(dummy[i]);
		}
		
		for (Productt temp : dummy) {
			System.out.println(temp.getName());
			System.out.println(temp.getNo());
			System.out.println(temp.getCost());
		}
	//anoher way

		
		Productt[] prod = {new Productt(10, "Pen" , 30.5d), new Productt(20, "Pencil", 90d),
				new Productt(30, "Eraser", 50d)};
		Double costt=0d;
		for (Productt temp : prod) {
			System.out.println(temp.getName());
			System.out.println(temp.getNo());
			System.out.println(temp.getCost());
			costt=costt+temp.getCost();
		}
		System.out.println("final Cost "+ costt);
	}

}
