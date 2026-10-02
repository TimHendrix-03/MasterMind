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
		
		
		//arrays
		String []invoer = new String[4];
		String []codeVak = new String[4];
		
		//tellers
		int rij = 0;
		int ronde = 0;
		int win = 0;
		
		//start spel
		codeVak[0] = pinRood;
		codeVak[1] = pinGeel;
		codeVak[2] = pinGroen;
		codeVak[3] = pinBlauw;
		
		//start user-input
		Scanner sc = new Scanner(System.in);
		
		for(rij=0; rij<=9;rij++) {
			for(ronde=0;ronde<=3;ronde++) {
				System.out.println("Kies een kleur");
				invoer[ronde]=sc.next();
				if(invoer[ronde].equalsIgnoreCase(codeVak[0])||invoer[ronde].equalsIgnoreCase(codeVak[1])||invoer[ronde].equalsIgnoreCase(codeVak[2])||invoer[ronde].equalsIgnoreCase(codeVak[3])) {
					if(invoer[ronde].equalsIgnoreCase(codeVak[ronde])) {
						System.out.println(pinZwart);
						win=win+1;
						if(win==4) {
							rij = 10;
						}
					}else System.out.println(pinWit);
				}else System.out.println(pinLeeg);
			} System.out.println("ronde " + rij + 1);
		}		
		//win-verlies condities
		if(win == 4) {
			System.out.println("Je hebt Gewonnen");
		}else System.out.println("Je hebt Verloren");
		sc.close();
	}

}
