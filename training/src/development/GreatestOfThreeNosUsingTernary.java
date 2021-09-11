package development;

public class GreatestOfThreeNosUsingTernary {

	public static void main(String[] args) {

		int a =6;
		int b =7;
		int c=3;
		
		System.out.println(a>b?"a gretare": "b greater");
		System.out.println(a>b?c>b ?"a gretare": "b greater":"c greater");
		
		int max = (a>b)?a:b;
		System.out.println(max);
	}

}
