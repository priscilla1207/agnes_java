import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int chance = 8;
		int finals = 0;
		boolean playagain = true;
		System.out.println("Hey Bestie!");
		System.out.println("So you have about" +chance+ "to win the game");
		while(playagain){
			int rand = getrandN(1,100);
			boolean guess = false;
			for(int i = 0; i < chances; i++) {
				System.out.println("Chance"+(i+1)+"Enter your Guess");
				int user = sc.nextInt();
				if(user == rand) {
					guess = true;
					finals += 1;
					System.out.println("YOU WON!!");
					break;
				}
				else if(user > guess) {
					System.out.println("Too High");
				}
				else {
					System.out.println("Too Low");
				}
			}
			if(guess == false) {
				System.out.println("Sorry Bestie! YOU LOST!");
				System.out.println("The Number was"+ rand);
			}
			System.out.println("Do you want to play Again(y/n)");
			String pa = sc.next();
			playagain = pa.equalsIgnoreCase("y");
		}
		System.out.println("Game Over,Hope you enjoyed it!");
		System.out.println("Here is your Score"+finals);
		public static int getrandN(int min, int max) {
			return (int)(Math.random()*(max-min+1)+min);
		}
	}
}
