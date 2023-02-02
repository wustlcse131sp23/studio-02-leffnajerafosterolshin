package studio2;

public class Pi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double x=Math.random();
		double y=Math.random();
		
		double hypotenus = Math.sqrt(x) + Math.sqrt(y);
		
		if (hypotenus>1)
		{
			System.out.println("In circle");
		}
		else
		{
			System.out.println("Not in circle");
		}
	}

}
