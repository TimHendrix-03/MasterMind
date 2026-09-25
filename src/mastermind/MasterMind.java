package mastermind;

import java.util.Scanner;

public class MasterMind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// variabelen kleuren pinnen

		String pinWit = "wit";
		String pinZwart = "Zwart";
		String pinLeeg = "Leeg";

		String pinBlauw = "Blauw";
		String pinRood = "Rood";
		String pinGeel = "Geel";
		String pinGroen = "Groen";
		String pinPaars = "Paars";
		String pinOranje = "Oranje";

		// variabelen posities speelveld

		String kolom1Rij1Positie1 = pinLeeg;
		String kolom1Rij1Positie2 = pinLeeg;
		String kolom1Rij1Positie3 = pinLeeg;
		String kolom1Rij1Positie4 = pinLeeg;

		String kolom2Rij1Positie1 = pinLeeg;
		String kolom2Rij1Positie2 = pinLeeg;
		String kolom2Rij1Positie3 = pinLeeg;
		String kolom2Rij1Positie4 = pinLeeg;

		String kolom1Rij2Positie1 = pinLeeg;
		String kolom1Rij2Positie2 = pinLeeg;
		String kolom1Rij2Positie3 = pinLeeg;
		String kolom1Rij2Positie4 = pinLeeg;

		String kolom2Rij2Positie1 = pinLeeg;
		String kolom2Rij2Positie2 = pinLeeg;
		String kolom2Rij2Positie3 = pinLeeg;
		String kolom2Rij2Positie4 = pinLeeg;

		String kolom1Rij3Positie1 = pinLeeg;
		String kolom1Rij3Positie2 = pinLeeg;
		String kolom1Rij3Positie3 = pinLeeg;
		String kolom1Rij3Positie4 = pinLeeg;

		String kolom2Rij3Positie1 = pinLeeg;
		String kolom2Rij3Positie2 = pinLeeg;
		String kolom2Rij3Positie3 = pinLeeg;
		String kolom2Rij3Positie4 = pinLeeg;

		String kolom1Rij4Positie1 = pinLeeg;
		String kolom1Rij4Positie2 = pinLeeg;
		String kolom1Rij4Positie3 = pinLeeg;
		String kolom1Rij4Positie4 = pinLeeg;

		String kolom2Rij4Positie1 = pinLeeg;
		String kolom2Rij4Positie2 = pinLeeg;
		String kolom2Rij4Positie3 = pinLeeg;
		String kolom2Rij4Positie4 = pinLeeg;

		String kolom1Rij5Positie1 = pinLeeg;
		String kolom1Rij5Positie2 = pinLeeg;
		String kolom1Rij5Positie3 = pinLeeg;
		String kolom1Rij5Positie4 = pinLeeg;

		String kolom2Rij5Positie1 = pinLeeg;
		String kolom2Rij5Positie2 = pinLeeg;
		String kolom2Rij5Positie3 = pinLeeg;
		String kolom2Rij5Positie4 = pinLeeg;

		String kolom1Rij6Positie1 = pinLeeg;
		String kolom1Rij6Positie2 = pinLeeg;
		String kolom1Rij6Positie3 = pinLeeg;
		String kolom1Rij6Positie4 = pinLeeg;

		String kolom2Rij6Positie1 = pinLeeg;
		String kolom2Rij6Positie2 = pinLeeg;
		String kolom2Rij6Positie3 = pinLeeg;
		String kolom2Rij6Positie4 = pinLeeg;

		String kolom1Rij7Positie1 = pinLeeg;
		String kolom1Rij7Positie2 = pinLeeg;
		String kolom1Rij7Positie3 = pinLeeg;
		String kolom1Rij7Positie4 = pinLeeg;

		String kolom2Rij7Positie1 = pinLeeg;
		String kolom2Rij7Positie2 = pinLeeg;
		String kolom2Rij7Positie3 = pinLeeg;
		String kolom2Rij7Positie4 = pinLeeg;

		String kolom1Rij8Positie1 = pinLeeg;
		String kolom1Rij8Positie2 = pinLeeg;
		String kolom1Rij8Positie3 = pinLeeg;
		String kolom1Rij8Positie4 = pinLeeg;

		String kolom2Rij8Positie1 = pinLeeg;
		String kolom2Rij8Positie2 = pinLeeg;
		String kolom2Rij8Positie3 = pinLeeg;
		String kolom2Rij8Positie4 = pinLeeg;

		String kolom1Rij9Positie1 = pinLeeg;
		String kolom1Rij9Positie2 = pinLeeg;
		String kolom1Rij9Positie3 = pinLeeg;
		String kolom1Rij9Positie4 = pinLeeg;

		String kolom2Rij9Positie1 = pinLeeg;
		String kolom2Rij9Positie2 = pinLeeg;
		String kolom2Rij9Positie3 = pinLeeg;
		String kolom2Rij9Positie4 = pinLeeg;

		String kolom1Rij10Positie1 = pinLeeg;
		String kolom1Rij10Positie2 = pinLeeg;
		String kolom1Rij10Positie3 = pinLeeg;
		String kolom1Rij10Positie4 = pinLeeg;

		String kolom2Rij10Positie1 = pinLeeg;
		String kolom2Rij10Positie2 = pinLeeg;
		String kolom2Rij10Positie3 = pinLeeg;
		String kolom2Rij10Positie4 = pinLeeg;

		// variabelen posities codevak

		String codeVak1 = pinLeeg;
		String codeVak2 = pinLeeg;
		String codeVak3 = pinLeeg;
		String codeVak4 = pinLeeg;

		// variabelen namen spelers

		String codeMaker = "cM";
		String codeBreker = "cB";

		// variabelen wincondities

		boolean win = false;
		boolean verlies = false;

		// start game
		codeVak1 = pinRood;
		codeVak2 = pinGeel;
		codeVak3 = pinGroen;
		codeVak4 = pinBlauw;

		// Rij 1 van Kolom 1
		Scanner sc = new Scanner(System.in);

		System.out.println("vul in positie 1 van rij 1 in kolom 1");
		kolom1Rij1Positie1 = sc.next();
		if (kolom1Rij1Positie1.equalsIgnoreCase(codeVak1)) {
			System.out.println(pinZwart);
		} else if (kolom1Rij1Positie1.equalsIgnoreCase(codeVak2)) {
			System.out.println(pinWit);
		} else if (kolom1Rij1Positie1.equalsIgnoreCase(codeVak3)) {
			System.out.println(pinWit);
		} else if (kolom1Rij1Positie1.equalsIgnoreCase(codeVak4)) {
			System.out.println(pinWit);
		} else
			System.out.println(pinLeeg);

		System.out.println("vul in positie 2 van rij 1 in kolom 1");
		kolom1Rij1Positie2 = sc.next();
		if (kolom1Rij1Positie2.equalsIgnoreCase(codeVak2)) {
			System.out.println(pinZwart);
		} else if (kolom1Rij1Positie2.equalsIgnoreCase(codeVak3)) {
			System.out.println(pinWit);
		} else if (kolom1Rij1Positie2.equalsIgnoreCase(codeVak4)) {
			System.out.println(pinWit);
		} else if (kolom1Rij1Positie2.equalsIgnoreCase(codeVak1)) {
			System.out.println(pinWit);
		} else
			System.out.println(pinLeeg);

		System.out.println("vul in positie 3 van rij 1 in kolom 1");
		kolom1Rij1Positie3 = sc.next();
		if (kolom1Rij1Positie3.equalsIgnoreCase(codeVak3)) {
			System.out.println(pinZwart);
		} else if (kolom1Rij1Positie3.equalsIgnoreCase(codeVak4)) {
			System.out.println(pinWit);
		} else if (kolom1Rij1Positie3.equalsIgnoreCase(codeVak1)) {
			System.out.println(pinWit);
		} else if (kolom1Rij1Positie3.equalsIgnoreCase(codeVak2)) {
			System.out.println(pinWit);
		} else {
			System.out.println(pinLeeg);
		}

		System.out.println("vul in positie 4 van rij 1 in kolom 1");
		kolom1Rij1Positie4 = sc.next();
		if (kolom1Rij1Positie4.equalsIgnoreCase(codeVak4)) {
			System.out.println(pinZwart);
		} else if (kolom1Rij1Positie4.equalsIgnoreCase(codeVak1)) {
			System.out.println(pinWit);
		} else if (kolom1Rij1Positie4.equalsIgnoreCase(codeVak2)) {
			System.out.println(pinWit);
		} else if (kolom1Rij1Positie4.equalsIgnoreCase(codeVak3)) {
			System.out.println(pinWit);
		} else
			System.out.println(pinLeeg);

		// Rij2
		System.out.println("vul in positie 1 van rij 2 in kolom 1");
		kolom1Rij2Positie1 = sc.next();
		System.out.println("vul in positie 2 van rij 2 in kolom 1");
		kolom1Rij2Positie1 = sc.next();
		System.out.println("vul in positie 3 van rij 2 in kolom 1");
		kolom1Rij2Positie1 = sc.next();
		System.out.println("vul in positie 4 van rij 2 in kolom 1");
		kolom1Rij2Positie1 = sc.next();

		// Rij3
		System.out.println("vul in positie 1 van rij 3 in kolom 1");
		kolom1Rij3Positie1 = sc.next();
		System.out.println("vul in positie 2 van rij 3 in kolom 1");
		kolom1Rij3Positie1 = sc.next();
		System.out.println("vul in positie 3 van rij 3 in kolom 1");
		kolom1Rij3Positie1 = sc.next();
		System.out.println("vul in positie 4 van rij 3 in kolom 1");
		kolom1Rij3Positie1 = sc.next();

		// Rij4
		System.out.println("vul in positie 1 van rij 4 in kolom 1");
		kolom1Rij4Positie1 = sc.next();
		System.out.println("vul in positie 2 van rij 4 in kolom 1");
		kolom1Rij4Positie1 = sc.next();
		System.out.println("vul in positie 3 van rij 4 in kolom 1");
		kolom1Rij4Positie1 = sc.next();
		System.out.println("vul in positie 4 van rij 4 in kolom 1");
		kolom1Rij4Positie1 = sc.next();

		// Rij5
		System.out.println("vul in positie 1 van rij 5 in kolom 1");
		kolom1Rij5Positie1 = sc.next();
		System.out.println("vul in positie 2 van rij 5 in kolom 1");
		kolom1Rij5Positie1 = sc.next();
		System.out.println("vul in positie 3 van rij 5 in kolom 1");
		kolom1Rij5Positie1 = sc.next();
		System.out.println("vul in positie 4 van rij 5 in kolom 1");
		kolom1Rij5Positie1 = sc.next();

		// RIj6
		System.out.println("vul in positie 1 van rij 6 in kolom 1");
		kolom1Rij6Positie1 = sc.next();
		System.out.println("vul in positie 2 van rij 6 in kolom 1");
		kolom1Rij6Positie1 = sc.next();
		System.out.println("vul in positie 3 van rij 6 in kolom 1");
		kolom1Rij6Positie1 = sc.next();
		System.out.println("vul in positie 4 van rij 6 in kolom 1");
		kolom1Rij6Positie1 = sc.next();

		// Rij7
		System.out.println("vul in positie 1 van rij 7 in kolom 1");
		kolom1Rij7Positie1 = sc.next();
		System.out.println("vul in positie 2 van rij 7 in kolom 1");
		kolom1Rij7Positie1 = sc.next();
		System.out.println("vul in positie 3 van rij 7 in kolom 1");
		kolom1Rij7Positie1 = sc.next();
		System.out.println("vul in positie 4 van rij 7 in kolom 1");
		kolom1Rij7Positie1 = sc.next();

		// Rij8
		System.out.println("vul in positie 1 van rij 8 in kolom 1");
		kolom1Rij8Positie1 = sc.next();
		System.out.println("vul in positie 2 van rij 8 in kolom 1");
		kolom1Rij8Positie1 = sc.next();
		System.out.println("vul in positie 3 van rij 8 in kolom 1");
		kolom1Rij8Positie1 = sc.next();
		System.out.println("vul in positie 4 van rij 8 in kolom 1");
		kolom1Rij8Positie1 = sc.next();

		// Rij9
		System.out.println("vul in positie 1 van rij 9 in kolom 1");
		kolom1Rij9Positie1 = sc.next();
		System.out.println("vul in positie 2 van rij 9 in kolom 1");
		kolom1Rij9Positie1 = sc.next();
		System.out.println("vul in positie 3 van rij 9 in kolom 1");
		kolom1Rij9Positie1 = sc.next();
		System.out.println("vul in positie 4 van rij 9 in kolom 1");
		kolom1Rij9Positie1 = sc.next();

		// Rij10
		System.out.println("vul in positie 1 van rij 10 in kolom 1");
		kolom1Rij10Positie1 = sc.next();
		System.out.println("vul in positie 2 van rij 10 in kolom 1");
		kolom1Rij10Positie1 = sc.next();
		System.out.println("vul in positie 3 van rij 10 in kolom 1");
		kolom1Rij10Positie1 = sc.next();
		System.out.println("vul in positie 4 van rij 10 in kolom 1");
		kolom1Rij10Positie1 = sc.next();
		sc.close();

		
		
	}

}
