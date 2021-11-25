package net.pablo.rpg_jav;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Player player5 = new Player("Roger", 300, 50);
		Player player6= new Player("Jean", 300, 50);
		
		System.out.println("name :" + player5.getName());
		System.out.println("life :" + player5.getHealth());
		player5.damage(player6.getAtk());
		System.out.println("life :" + player5.getHealth());
		
		int start = 0;
		if(start == 0) {
			System.out.println("Joueur 1 choisi Choisi son Champion!");
			System.out.println("Pour le Chavalier : tape 1");
			System.out.println("Pour le Mage : tape 2");
			System.out.println("Pour l'Archer : tape 3");
			Scanner scan = new Scanner (System.in);
			if (scan.nextInt() != 1 && scan.nextInt() != 2 && scan.nextInt() !=3) {
				if(scan.nextInt() == 1) {
					System.out.println("Le Chavalier! Choisie lui un nom!!");
					Scanner scanName = new Scanner (System.in);
					Player player1 = new Player(scanName.nextLine(), 300, 50);
					
				} 
				else if(scan.nextInt() == 2) {
					System.out.println("Le Mage! Choisie lui un nom!!");
					Scanner scanName = new Scanner (System.in);
					Player player1 = new Player(scanName.nextLine(), 300, 50);
					
				}
				else if(scan.nextInt() == 3) {
					System.out.println("Le l'Archer! Choisie lui un nom!!");
					Scanner scanName = new Scanner (System.in);
					Player player1 = new Player(scanName.nextLine(), 300, 50);
					
				}	
			} else {
				System.out.println("Tu a le choix entre 1 , 2 ou 3!!!");
				System.out.println("Joueur 1 choisi Choisi son Champion!");
				System.out.println("Pour le Chavalier : tape 1");
				System.out.println("Pour le Mage : tape 2");
				System.out.println("Pour l'Archer : tape 3");
				scan = new Scanner (System.in);
			}
			
			
		
			System.out.println(scan.nextInt());
			System.out.println(scan.nextLine());
		}
		

	}

}
