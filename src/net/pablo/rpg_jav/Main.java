package net.pablo.rpg_jav;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		
		int start = 0;
		if(start == 0) {
			System.out.println("Joueur 1: choisi ton Champion!");
			System.out.println("Pour le Chavalier : tape 1");
			System.out.println("Pour le Mage : tape 2");
			System.out.println("Pour l'Archer : tape 3");
			Scanner scan = new Scanner (System.in);
			int choice = scan.nextInt();
			if (choice != 1 && choice != 2 && choice !=3) {
					System.out.println("Tu a le choix entre 1 , 2 ou 3!!!");
				System.out.println("Joueur 1: choisi ton Champion!");
				System.out.println("Pour le Chavalier : tape 1");
				System.out.println("Pour le Mage : tape 2");
				System.out.println("Pour l'Archer : tape 3");
				scan = new Scanner (System.in);
				
			} else {
				if(choice == 1) {
					System.out.println("Le Chavalier! Choisie lui un nom!!");
					Scanner scanName = new Scanner (System.in);
					Knight player1 = new Knight(scanName.nextLine(), 300, 50);
					
				} 
				else if(choice == 2) {
					System.out.println("Le Mage! Choisie lui un nom!!");
					Scanner scanName = new Scanner (System.in);
					Mage player1 = new Mage(scanName.nextLine(), 300, 50);
					
				}
				else if(choice == 3) {
					System.out.println("Le l'Archer! Choisie lui un nom!!");
					Scanner scanName = new Scanner (System.in);
					Archer player1 = new Archer(scanName.nextLine(), 300, 50);
					
				}
			}
			
		
			System.out.println(scan.nextInt());
			System.out.println(scan.nextLine());
		}
		

	}

}
