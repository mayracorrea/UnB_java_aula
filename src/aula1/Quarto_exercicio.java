//Escreva um programa em Java que solicite ao usuário um endereço de email 
//e extraia o domínio desse email. O domínio é a parte do email após o símbolo @.
//
//Requisitos:
//
//● O programa deve solicitar ao usuário um endereço de email e ler a entrada do usuário utilizando a classe java.util.Scanner.
//
//● O programa deve utilizar o método indexOf para encontrar a posição do símbolo @ no email.
//
//● O programa deve utilizar o método substring para extrair a parte do email após o símbolo @.
//
//● O programa deve exibir o domínio extraído.
package aula1;

import java.util.Scanner;
public class Quarto_exercicio {
public static void main(String[] args) {

	// Cria um objeto Scanner para ler a entrada do usuário
Scanner scanner = new Scanner(System.in);

System.out.print("Digite um endereço de email: ");
	String email = scanner.nextLine(); // variavel email tipo string

	//O metodo indexOf() retorna a posição da primeira ocorrência do(s) caracter(es) especificado(s) em uma string.
	
	// Encontra a posição do símbolo @ no email
	
	int variavel = email.indexOf("@");

	if (variavel != -1) {
		// Extrai a parte do email após o símbolo @
	String dominio = email.substring(variavel+ 1); //substring extrai parte do email apos o simbolo @
	System.out.println("O domínio do e-mail informado é: " + dominio);
	} else {
	System.out.println("Endereço de email inválido.");
	}

	scanner.close();
	}
	}