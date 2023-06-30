//Exercício 1: Calcular a soma dos números pares de 1 a N
		//
		//Escreva um programa em Java que solicite ao usuário um número inteiro positivo N e calcule a
		//soma de todos os números pares de 1 até N.
		//
		//Requisitos:
		//
		//● O programa deve utilizar um loop for para iterar pelos números de 1 a N.
		//
		//● A soma dos números pares deve ser armazenada em uma variável.
		//
		//● Ao final, o programa deve exibir a soma calculada.
		package aula1;
		
		
import java.util.Scanner;

public class Primeiro_exercicio {
public static void main(String[] args) {

Scanner leitor = new Scanner(System.in);
System.out.print("Por favor, digite um número inteiro positivo: ");
int n = leitor.nextInt();// permite ler uma entrada digitada pelo usuário e atribuí-la à variável n
int soma=0; // inicia a variável com 0

		for (int i =1; i<=n; i++) //for (inicialização; condição; incremento/decremento) 
			{
		
			if (i%2 ==0){ // verifica se o número i é par
			soma = soma+i;
		  
			
		}
			}
System.out.println("A soma de todos os números pares até " +n+ " é " +soma);

}

	}
	
