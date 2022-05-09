/*
2- Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
 */
package LacosDeRepeticao;

import java.util.Scanner;

public class Atividade2  {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int a ,n1, impar = 0 , par = 0;
		
		
		for(n1 = 1; n1 <= 10; n1++)
		{
			
			System.out.println("Escolha um numero :" +n1);
			a =ler.nextInt();
			
		
		if(a % 2 == 0) {
			par++;
		}
		
		if(a % 2 == 1) {
			impar++;
			}
		}
		System.out.println("Foram inseridos " +par+ " numeros pares, \nE "+impar+ " nu15"
				+ "meros ímpares.");
	}

	
	}
