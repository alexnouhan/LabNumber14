package co.grandcircus;

import java.util.Scanner;

public class RoshamboApp {

	// Alex Nouhan
	// Grand Circus 2019

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char opp;
		int uW = 0;
		int oW = 0;
		int games = 0;

		// Greet User
		System.out.println("Welcom to Rock Paper Scissors!");
		System.out.println("``````````````````````````````");

		// Name User Player
		String name = Validator.getLine(scan, "Enter your name: ");
		Player user = new UserPlayer(name);
		Player opponent = null;

		// Choose Opponent
		while (true) {
			System.out.print("Would you like to play against Comte or Cornwallis? (C/c): ");
			opp = scan.next().charAt(0);
			if (opp == 'C') {
				opponent = new Comte();
				break;
			} else if (opp == 'c') {
				opponent = new Cornwallis();
				break;
			} else {
				continue;
			}
		}
		System.out.println();
		System.out.println("Ok, you're playing agianst " + opponent.getName());

		// Play Loop
		while (true) {
			// choose RPS
			System.out.println();
			String choice = Validator.getString(scan, "Rock, Paper, or Scissors? (R/P/S/q to quit): ");
			System.out.println();
			choice = choice.substring(0, 1);
			if (choice.equalsIgnoreCase("q")) {
				// Play again?
				int go = Validator.getGo(scan, "Are you sure you want to quit? (y/n): ");
				if (go == 2) {
					continue;
				} else if (go == 1) {
					break;
				} else if (go == 3) {
					System.out.println("secret");
				} else {
					System.out.println("error!");
					continue;
				}
			} else {
				user.setHand(choice);

				// get hands
				Roshambo uHand = user.generateRoshambo();
				Roshambo oHand = opponent.generateRoshambo();

				// play hands
				if (uHand == oHand) {
					System.out.println("Draw!");
				} else if (uHand == Roshambo.ROCK && oHand == Roshambo.PAPER) {
					System.out.println(user.getName() + ": " + uHand);
					System.out.println(opponent.getName() + ": " + oHand);
					System.out.println();
					System.out.println(opponent.getName() + " wins!");
					oW += 1;
				} else if (uHand == Roshambo.ROCK && oHand == Roshambo.SCISSORS) {
					System.out.println(user.getName() + ": " + uHand);
					System.out.println(opponent.getName() + ": " + oHand);
					System.out.println();
					System.out.println("You win!");
					uW += 1;
				} else if (uHand == Roshambo.PAPER && oHand == Roshambo.ROCK) {
					System.out.println(user.getName() + ": " + uHand);
					System.out.println(opponent.getName() + ": " + oHand);
					System.out.println();
					System.out.println("You win!");
					uW += 1;
				} else if (uHand == Roshambo.PAPER && oHand == Roshambo.SCISSORS) {
					System.out.println(user.getName() + ": " + uHand);
					System.out.println(opponent.getName() + ": " + oHand);
					System.out.println();
					System.out.println(opponent.getName() + " wins!");
					oW += 1;
				} else if (uHand == Roshambo.SCISSORS && oHand == Roshambo.PAPER) {
					System.out.println(user.getName() + ": " + uHand);
					System.out.println(opponent.getName() + ": " + oHand);
					System.out.println();
					System.out.println("You win!");
					uW += 1;
				} else if (uHand == Roshambo.SCISSORS && oHand == Roshambo.ROCK) {
					System.out.println(user.getName() + ": " + uHand);
					System.out.println(opponent.getName() + ": " + oHand);
					System.out.println();
					System.out.println(opponent.getName() + " wins!");
					oW += 1;
				}
				games += 1;
			}
		}

		System.out.println();
		System.out.println("Score");
		System.out.println("`````");
		System.out.println(user.getName() + ": " + uW);
		System.out.println(opponent.getName() + ": " + oW);
		System.out.println("Out of " + games + " games");
		System.out.println();

		System.out.println("Thanks for playing! Goodbye!");
		scan.close();
	}

}
