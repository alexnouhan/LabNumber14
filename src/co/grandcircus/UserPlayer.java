package co.grandcircus;

public class UserPlayer extends Player {
	
	public UserPlayer(String name) {
		this.name = name;
	}
	

	@Override
	public Roshambo generateRoshambo() {
		if (hand.equalsIgnoreCase("r")) {
			return Roshambo.ROCK;
		} else if (hand.equalsIgnoreCase("p")) {
			return Roshambo.PAPER;
		} else {
			return Roshambo.SCISSORS;
		}
		
	}

	
}
