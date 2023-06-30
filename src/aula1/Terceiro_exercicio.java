//Exercício 3: Adivinhe o número
//
//Escreva um programa em Java que gera um número aleatório entre 1 e 100 
//e permite que o usuário adivinhe qual é esse número. O programa deve fornecer dicas para ajudar 
//o usuário a chegar à resposta correta. O programa deve continuar executando até que o usuário adivinhe 
//corretamente o número.
//
//Requisitos:
//
//● O programa deve gerar um número aleatório entre 1 e 100 utilizando a classe java.util.Random.
//
//● O programa deve solicitar ao usuário que adivinhe o número e ler a entrada do usuário utilizando a classe 
//java.util.Scanner.
//
//● O programa deve fornecer dicas ao usuário após cada tentativa, indicando se o número a ser adivinhado
//é maior ou menor do que a tentativa atual.
//
//● O programa deve continuar executando até que o usuário adivinhe corretamente o número.
//
//● Ao final, o programa deve exibir o número total de tentativas realizadas pelo usuário para adivinhar o número.
//
//Neste exercício, o programa gera um número aleatório entre 1 e 100 utilizando a classe java.util.Random. 
//Em seguida, o programa solicita ao usuário que adivinhe o número e lê a entrada do usuário utilizando a 
//classe java.util.Scanner. O programa fornece dicas ao usuário após cada tentativa, indicando se o número 
//a ser adivinhado é maior ou menor do que a tentativa atual. 
//O programa continua executando até que o usuário adivinhe corretamente o número. 
//Ao final, o número total de tentativas realizadas pelo usuário é exibido.
package aula1;

import java.util.Random;
import java.util.Scanner;

public class Terceiro_exercicio {
public static void main(String[] args) {
//instância um objeto da classe Random usando o construtor padrão
Random random = new Random();

int NumeroAleatorio =1; //intancia a variável com 1
NumeroAleatorio = random.nextInt(100); // pega um numero aleatório até 100
int tentativas = 0; //intancia a variável com 0
int palpite = 0; //intancia a variável com 0

//Cria um objeto Scanner para ler a entrada do usuário
Scanner scanner = new Scanner(System.in);


while (palpite != NumeroAleatorio) {
System.out.print("Adivinhe o número entre 1 e 100: ");
palpite = scanner.nextInt();
tentativas++;

if (palpite < NumeroAleatorio) {
System.out.println("Tente um número maior!");
} else if (palpite > NumeroAleatorio) {
System.out.println("Tente um número menor!");
}
}

System.out.println("Parabéns, você acertou! O número era " + NumeroAleatorio);
System.out.println("Total de tentativas: " + tentativas);

scanner.close();
}
}