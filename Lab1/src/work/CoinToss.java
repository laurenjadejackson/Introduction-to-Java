package work;

public class CoinToss {

	public static void main(String[] args) {
		
		int randomNumber = (int) (Math.random() * 10) + 1; 
		
		if (randomNumber <=5)
		{
			System.out.println("This will be heads");
		}
		
		if (randomNumber >=6)
		{
			System.out.println("This will be tails");
		}
	}
}
