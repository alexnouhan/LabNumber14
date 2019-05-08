package co.grandcircus;

public class Cornwallis extends Player {

	public Cornwallis() {
		this.name = "Cornwallis";
	}
	
	@Override
	public Roshambo generateRoshambo() {
		return Roshambo.ROCK;
	}

}
