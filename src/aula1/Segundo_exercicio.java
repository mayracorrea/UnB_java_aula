//Exercício 2: Calcular a soma dos números pares de M a N
//
//Escreva um programa em Java que solicite ao usuário 2 números inteiros positivos M e N e 
//calcule a soma de todos os números pares de M até N.

//Requisitos:
//
//● O programa deve utilizar um loop for para iterar pelos números de M a N.
//
//● A soma dos números pares deve ser armazenada em uma variável.
//
//● Ao final, o programa deve exibir a soma calculada.
package aula1;

import java.util.Scanner;

public class Segundo_exercicio {
public static void main(String[] args) {

Scanner leitor = new Scanner(System.in);

System.out.print("Por favor, digite o primeiro número inteiro positivo: ");
int n = leitor.nextInt();// permite ler uma entrada digitada pelo usuário e atribuí-la à variável n

System.out.print("Por favor, digite o segundo número inteiro positivo: ");
int m = leitor.nextInt();// permite ler uma entrada digitada pelo usuário e atribuí-la à variável m

int soma=0; // inicia a variável com 0

		for (int i =n; i<=m; i++) //for (inicialização; condição; incremento/decremento) 
			{
					if (i%2 ==0){ // verifica se o número i é par
			soma = soma +i;
		
			}
			}
System.out.println("A soma de todos os números pares entre o primeiro e o segundo número é " +soma);
	
}

	}
	


