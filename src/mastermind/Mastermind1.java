package mastermind;

import java.util.Scanner;

public class Mastermind1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//variable kleuren
		String pinWit = "wit";
		String pinZwart = "Zwart";
		String pinLeeg = "Leeg";

		String pinBlauw = "Blauw";
		String pinRood = "Rood";
		String pinGeel = "Geel";
		String pinGroen = "Groen";
		String pinPaars = "Paars";
		String pinOranje = "Oranje";
		
		String []invoer = new String[4];
		String []codeVak = new String[4];
		int rij = 0;
		int teller = 0;
		
		//start spel
		codeVak[0] = pinRood;
		codeVak[1] = pinGeel;
		codeVak[2] = pinGroen;
		codeVak[3] = pinBlauw;
		
		//start user-input
		Scanner sc = new Scanner(System.in);
		
		for(rij=0; rij<=9;rij++) {
			for(teller=0;teller<=3;teller++) {
				System.out.println("Kies een kleur");
				invoer[teller]=sc.next();
				if(invoer[teller].equalsIgnoreCase(codeVak[0])||invoer[teller].equalsIgnoreCase(codeVak[1])||invoer[teller].equalsIgnoreCase(codeVak[2])||invoer[teller].equalsIgnoreCase(codeVak[3])) {
					if(invoer[teller].equalsIgnoreCase(codeVak[teller])) {
						System.out.println(pinZwart);
					}else System.out.println(pinWit);
				}else System.out.println(pinLeeg);
			}
		}
		
		
		sc.close();
		
	}

}
