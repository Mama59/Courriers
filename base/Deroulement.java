package base;

import java.util.Random;

import content.*;
import letter.*;

public class Deroulement {
	static int NUMBER_OF_INHABITANTS = 100;
	static City roubaix;

	public static void main(String[] args) {
		roubaix = new City("Roubaix");
		for (int i = 1; i < NUMBER_OF_INHABITANTS + 1; i++) {
			Inhabitant p = new Inhabitant(("inhabitant_" + i));
			roubaix.addInhabitant(p);
		}
		int week = 6;
		for (int i = 1; i <= week; i++) {
			for (int j = 0; j < 60; j++) {
				System.out.print("*");
			}
			System.out.println("\nDay " + i);
			roubaix.playDay();
			sendRandomsLetters();
		}
		week++;
		for (int j = 0; j < 60; j++) {
			System.out.print("*");
		}
		System.out.println("\nDay " + week++);
		roubaix.playDay();
		for (int j = 0; j < 60; j++) {
			System.out.print("*");
		}
		System.out.println("\nDay " + week++);
		roubaix.playDay();
		for (int j = 0; j < 60; j++) {
			System.out.print("*");
		}
		System.out.println("\nDay " + week++);
		roubaix.playDay();
	}

	private static void sendRandomsLetters() {
		Random rand = new Random();
		int number_of_letters = rand.nextInt(10) + 5;
		// number_of_letters = 1;
		int sender;
		int receiver;
		for (int i = 0; i < number_of_letters; i++) {
			sender = rand.nextInt(NUMBER_OF_INHABITANTS);
			receiver = rand.nextInt(NUMBER_OF_INHABITANTS);
			Inhabitant senderI = roubaix.getAllInhabitants().get(sender);
			Inhabitant receiverI = roubaix.getAllInhabitants().get(receiver);
			senderI.postsLetter(createRandomLetter(senderI, receiverI));
		}
	}

	private static <T> Letter<?> createRandomLetter(Inhabitant senderI,
			Inhabitant receiverI) {
		Random rand = new Random();
		Letter<?> letter;
		Random rand2 = new Random();
		switch (rand.nextInt(5)) {
		case 0:
			letter = new PromissoryNote(senderI, receiverI, new Money(
					rand2.nextInt(100)));
			break;
		case 1:
			letter = new RegistredLetter<Letter<?>>(createRandomLetter(senderI,
					receiverI));
			break;
		case 2:
			letter = new UrgentLetter<Letter<?>>(createRandomLetter(senderI,
					receiverI));
			break;
		default:
			letter = new SimpleLetter(senderI, receiverI, new Text(
					"bonjour " + receiverI.toString()));
		}
		return letter;
	}
}
