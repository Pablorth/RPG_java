package net.pablo.rpg_jav;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Knight player4 = new Knight("Bob", 300, 50);
		Archer player5 = new Archer("Bill", 300, 50);
		System.out.println(player4.getName());
		System.out.println(player5.getName());
		System.out.println(player4.getHealth());
		player4.damage(player5.getAtk());
		System.out.println(player4.getHealth());
		
		int start = 0;
		while (start == 0) {
			
			int choice = 0;
			
			while (choice != 1 && choice != 2 && choice !=3) {
				System.out.println("Tu a le choix entre 1 , 2 ou 3!!!");
				System.out.println("Joueur 1: choisi ton Champion!");
				System.out.println("Pour le Chavalier : tape 1");
				System.out.println("Pour le Mage : tape 2");
				System.out.println("Pour l'Archer : tape 3");
				Scanner scan = new Scanner (System.in);
				choice = scan.nextInt();
				
			} 
			
			if(choice == 1) {
				System.out.println("Le Chavalier! Choisie lui un nom!!");
				Scanner scanName = new Scanner (System.in);
				Knight player1 = new Knight(scanName.nextLine(), 300, 50);
				System.out.println("Bienvenu " + player1.getName() +" \n");
			} else if(choice == 2) {
				System.out.println("Le Mage! Choisie lui un nom!!");
				Scanner scanName = new Scanner (System.in);
				Mage player1 = new Mage(scanName.nextLine(), 300, 50);
				System.out.println("Bienvenu " + player1.getName() +" \n");
				
			} else if(choice == 3) {
				System.out.println("L'Archer! Choisie lui un nom!!");
				Scanner scanName = new Scanner (System.in);
				Archer player1 = new Archer(scanName.nextLine(), 300, 50);
				System.out.println("Bienvenu " + player1.getName() +" \n");
			}
			
			int choice2 = 0;
			
			while (choice2 != 1 && choice2 != 2 && choice2 !=3) {
				System.out.println("Tu a le choix entre 1 , 2 ou 3!!!");
				System.out.println("Joueur 2: choisi ton Champion!");
				System.out.println("Pour le Chavalier : tape 1");
				System.out.println("Pour le Mage : tape 2");
				System.out.println("Pour l'Archer : tape 3");
				Scanner scan = new Scanner (System.in);
				choice2 = scan.nextInt();
				
			} 
			
			if(choice2 == 1) {
				System.out.println("Le Chavalier! Choisie lui un nom!!");
				Scanner scanName = new Scanner (System.in);
				Knight player2 = new Knight(scanName.nextLine(), 300, 50);
				System.out.println("Bienvenu " + player2.getName() +" \n");
				
			} else if(choice2 == 2) {
				System.out.println("Le Mage! Choisie lui un nom!!");
				Scanner scanName = new Scanner (System.in);
				Mage player2 = new Mage(scanName.nextLine(), 300, 50);
				System.out.println("Bienvenu " + player2.getName()+" \n");
				
			} else if(choice2 == 3) {
				System.out.println("L'Archer! Choisie lui un nom!! ");
				Scanner scanName = new Scanner (System.in);
				Archer player2 = new Archer(scanName.nextLine(), 300, 50);
				System.out.println("Bienvenu " + player2.getName() +" \n");
				
			}
			//System.out.println("Se sera " + player2.getName() +" \n");
			start = 1;
		} 
		
		while (start != 0){
			
			int turn = 0;
			while (turn == 0) {
				int choice =0;
				while(choice != 1 && choice != 2 && choice !=3) {
					System.out.println("Joueur 1 que fait tu?");
					System.out.println("Tape 1 pour attaquer. ");
					System.out.println("Tape 2 pour te protéger. ");
					System.out.println("Tape 3 pour te soigner. ");
					Scanner scan = new Scanner (System.in);
					choice = scan.nextInt();
					if (choice == 1) {
						turn = 1;
					} else if (choice == 2) {
						turn = 1;
					} else if (choice == 3) {
						turn = 1;
					}
				}
				
				
			}
			while(turn != 0 ) {
				int choice =0;
				while(choice != 1 && choice != 2 && choice !=3) {
					System.out.println("Joueur 2 que fait tu?");
					System.out.println("Tape 1 pour attaquer. ");
					System.out.println("Tape 2 pour te protéger. ");
					System.out.println("Tape 3 pour te soigner. ");
					Scanner scan = new Scanner (System.in);
					choice = scan.nextInt();
					if (choice == 1) {
						turn = 0;
					} else if (choice == 2) {
						turn = 0;
					} else if (choice == 3) {
						turn = 0;
					}
				}
			}
			
			
			start = 0;
			
		}
		

	}

}
