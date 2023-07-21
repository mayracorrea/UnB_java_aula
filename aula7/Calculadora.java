package aula7;
//Classe principal (Calculadora)
public class Calculadora {
 public static void main(String[] args) {
     // Expressão: 10 - 5
     int numero1 = 10;
     int numero2 = 5;

     // Criando uma instância da operação de subtração
     Operacao subtracao = new Subtracao();

     // Executando a operação e exibindo o resultado
     int resultado = subtracao.executa(numero1, numero2);
    
 	     // Expressão: 6 * 2
	     int numero3 = 6;
	     int numero4 = 2;

	     // Criando uma instância da operação de multiplicação
	     Operacao multiplicacao = new Multiplicacao();
	     
	     
	   	          // Expressão: 15 / 3
	          int numero5 = 15;
	          int numero6 = 3;

	          // Criando uma instância da operação de divisão
	          Operacao divisao = new Divisao();

	          // Executando a operação e exibindo o resultado
	          int resultado3 = divisao.executa(numero5, numero6);
	         
	          
	        
	               // Expressão: 2 ^ 3
	               int base = 2;
	               int expoente = 3;

	               // Criando uma instância da operação de exponenciação
	               Operacao exponenciacao = new Exponenciacao();

	               // Executando a operação e exibindo o resultado
	               int resultado4 = exponenciacao.executa(base, expoente);
	              
	          
	            	                    // Expressão: 10 % 40
	                    int percentagem = 10;
	                    int valorTotal = 40;

	                    // Criando uma instância da operação de porcentagem
	                    Operacao percent = new Percent();

	                    // Executando a operação e exibindo o resultado
	                    int resultado5 = percent.executa(percentagem, valorTotal);
	              

	     // Executando a operação e exibindo o resultado
	     int resultado2 = multiplicacao.executa(numero3, numero4);
	     System.out.println("Resultado da expressão: " + resultado);
	     System.out.println("Resultado da expressão: " + resultado2);
	     System.out.println("Resultado da expressão: " + resultado3);
	     System.out.println("Resultado da expressão: " + resultado4);
	     System.out.println("Resultado da expressão: " + resultado5);
         
	 } 
	}

