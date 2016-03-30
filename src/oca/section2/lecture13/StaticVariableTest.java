package oca.section2.lecture13;

public class StaticVariableTest {
	public static void main(String[] args) {
		Player p1 = new Player();
		p1.connectToServer();
		
		Player p2 = new Player();
		p2.connectToServer();
		
		Player p3 = new Player();
		p3.connectToServer();
		
		System.out.println("Player count:" + Player.playerCount);
	}
}

class Player {
	public static int playerCount = 0;

	public void connectToServer() {
		System.out.println("Connected.");
		playerCount++;
	}
}

