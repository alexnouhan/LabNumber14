package co.grandcircus;

public abstract class Player {
	
	String name;
	String hand;
	
	public Player() {
		
	}
	
	public Player(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public String getHand() {
		return hand;
	}

	public void setHand(String hand) {
		this.hand = hand;
	}

	public abstract Roshambo generateRoshambo();
	
	

}
