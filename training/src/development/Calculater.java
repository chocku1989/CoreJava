package development;

public class Calculater {

	public static void main(String[] args) {

		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		float c = 0;
		String action = args[2];
		switch (action.toUpperCase()) {

		case "ADD":
			c = a + b;
			break;
		case "SUBRACT":
			c = a - b;
			break;
		case "MULTIPLY":
			c = a * b;
			break;
		case "DIVISION":
			c = a / b;
			break;
		default:
			System.out.println("no match");

		}
		System.out.println("output is " + c);
		String d = "7";
		System.out.println(Integer.parseInt(d));
	}

}
