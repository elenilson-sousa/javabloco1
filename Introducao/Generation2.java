/*
 4- Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado.
 */

package Introducao;

import java.util.Scanner;


public class Generation2 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		int n1;
		
		System.out.println("Digite um numero ? ");
		n1=ler.nextInt();
		
		if(n1 % 2==0) 
		{
		System.out.println("o numero que voce digitou e par!!! \ne a raiz quadrada dele é" +Math.sqrt(n1));
		System.out.println("\nFim de programa");	
		}
		else
		{
			System.out.println("o numero que voce digitou e impar !!! e elevado ao quadrado da " +Math.pow (n1 ,2));
			System.out.println("\nFim de programa");
		}
		}
}