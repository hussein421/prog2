package prog2;

import java.util.Scanner;

public class SummanAvTal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		Summan(sc);	}
	private static void Summan(Scanner sc) {
		System.out.println("skriv in heltal, n�r du �r klar skriv 0 och tryck enter s� r�knar jag ut summan av dina tal!");
		int tal = sc.nextInt();
		int summa = 0;
		boolean spela = true;
		while(spela) {
		if (tal != 0) {
			 summa += tal; 
			 tal = sc.nextInt();	
		}else {
			System.out.println("summan av dom talen du skrev �r " +summa);
			spela = false;		
		}}}}


