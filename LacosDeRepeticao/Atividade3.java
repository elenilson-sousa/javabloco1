/*3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE)
*/
package LacosDeRepeticao;

import java.util.Scanner;

public class Atividade3 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		int idade ,j=0, a=0;
		System.out.println("\nDigite sua idade: ");
		idade = entrada.nextInt();
			
		while (idade <=99) {
			if(idade<21)j++;
			if(idade>50)a++;
			System.out.println("Insira a sua idade: ");
			idade = entrada.nextInt();		
		}

		System.out.println("O total com menos de 21 anos é: " +j);
		System.out.println("O total com mais de 50 anos é: " +a);
			
	}

}