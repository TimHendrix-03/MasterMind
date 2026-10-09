package mastermind;

import java.util.Scanner;
import java.util.Random;

public class Mastermind1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int lengte = 0;

		while (lengte <= 0) {
			System.out.print("Hoe lang mag de code zijn");
			System.out.println(", kies een nummer groter dan 0");
			try {
				lengte = sc.nextInt();
			} catch (Exception ex) {
				sc.nextLine();
				lengte = 0;
			}
		}

		// arrays
		String[] kleurenControle = { "Wit", "Zwart", "Leeg" };
		String[] kleurenInvoer = { "Blauw", "Rood", "Geel", "Groen", "Paars", "Oranje" };
		String[] invoer = new String[lengte];
		String[] codeVak = new String[invoer.length];

		// tellers
		int rij = 0;
		int ronde = 0;
		int win = 0;
		int check = 0;

		// start spel
		Random rand = new Random();
		for (int i = 0; i < invoer.length; i++) {
			codeVak[i] = kleurenInvoer[rand.nextInt(kleurenInvoer.length)];
		}

		// start controle
		for (rij = 0; rij <= 9; rij++) {
			win = 0;
			System.out.print("rij ");
			System.out.println(rij + 1);
			for (ronde = 0; ronde < invoer.length; ronde++) {
				int onbekendeInvoer = 0;
				while (onbekendeInvoer < kleurenInvoer.length) {
					System.out.println("Kies een kleur");
					invoer[ronde] = sc.next();
					for (int j = 0; j < kleurenInvoer.length; j++) {
						if (invoer[ronde].equalsIgnoreCase(kleurenInvoer[j])) {
							onbekendeInvoer = 6;
							j = 6;
						}
					}
					if (onbekendeInvoer != 6) {
						System.out.println("onbekende invoer, probeer opnieuw");
					}
				}

				if (invoer[ronde].equalsIgnoreCase(codeVak[ronde])) {
					System.out.println(kleurenControle[1]);
					win = win + 1;
					if (win == 4) {
						rij = 10;
					}
				} else {
					for (check = 0; check < invoer.length; check++) {
						if (invoer[ronde].equalsIgnoreCase(codeVak[check])) {
							System.out.println(kleurenControle[0]);
							check = 4;
						} else {
							if (check == invoer.length - 1) {
								System.out.println(kleurenControle[2]);
							}
						}
					}
				}
			}
		}
		// win-verlies condities
		if (win == 4) {
			System.out.println("Je hebt Gewonnen");
		} else
			System.out.println("Je hebt Verloren");
		sc.close();

	}
}
