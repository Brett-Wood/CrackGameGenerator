import java.util.*;

public class CrackGameTester {
	public static void main(String[] args) 
	{
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter the number of players");
		Random random = new Random();
		int numberOfPlayers = scnr.nextInt();
		Player[] players = new Player[numberOfPlayers];
		// This creates all of the players in the game and puts them in an array
		for(int i = 0; i < numberOfPlayers; i++)
		{
			Player newPlayer = new Player();
			int number = i+1;
			String name = "Player "+ number;
			newPlayer.setName(name);
			players[i] = newPlayer;
			
		}
		for(Player current: players)
		{
			int handicap = random.nextInt(8) + 11;
			current.setHandicap(handicap);
			for(int hole = 0; hole < 18; hole++)
			{
				int holeScore = random.nextInt(3) + 4;
				current.setScore(hole, holeScore);
			}
		}
		System.out.println("Game Results");
		for(int holes = 0; holes < 18; holes++)
		{
			if(holes == 0)
			{
				boolean pressFront = random.nextBoolean();
				System.out.println("Press on the Front Nine: "+pressFront);
			}
			else if(holes == 9)
			{
				boolean pressBack = random.nextBoolean();
				System.out.println("Press on the Back Nine: "+pressBack);
			}
			int cracks = random.nextInt(numberOfPlayers) + 1;
			int current = holes+1;
			System.out.println("Cracks for hole "+current+": "+ cracks);
		}
		for(Player player: players)
		{
			System.out.println(player);
		}
	}
}
