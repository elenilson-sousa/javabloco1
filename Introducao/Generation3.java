package Introducao;

import java.util.Scanner;

public class Generation3 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int n1,n2,n3;
		
		System.out.println("Digite o primeiro numero ");
		n1 = ler.nextInt();
		System.out.println("Digite o Segundo Numero ");
		n2 = ler.nextInt();
		System.out.println("Digite o Treceiro Nemero ");
		n3 = ler.nextInt();
		
		if((n1>n2) && (n1>n3)) {
	
		System.out.println("\nO Primeiro Numero é o Maior ");}
		
		if((n2>n1) && (n2>n3)) {
		System.out.println("\nO Segundo Numero é o Maior ");}
		
		if((n2>n1) && (n2>n3)) {
			System.out.println("\nO Terceiro Numero é o Maior ");}

	}
}