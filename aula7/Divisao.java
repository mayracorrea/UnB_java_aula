package aula7;

//Classe Divisao que estende a classe Operacao
class Divisao extends Operacao {
 @Override
 int executa(int a, int b) {
     if (b == 0) {
         throw new ArithmeticException("Divisão por zero não é permitida.");
     }
     return a / b;
 }
}


