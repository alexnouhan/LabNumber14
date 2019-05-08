package co.grandcircus;

import java.util.Random;

public class Comte extends Player {
	
	public Comte() {
		this.name = "Comte";
	}

	@Override
	public Roshambo generateRoshambo() {
		Random random = new Random();
		int rombo = random.nextInt(3);
		if (rombo == 0) {
			return Roshambo.ROCK;
		} else if (rombo == 1) {
			return Roshambo.PAPER;
		} else {
			return Roshambo.SCISSORS;
		}
	}


}
