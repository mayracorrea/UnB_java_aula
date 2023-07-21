package aula7;

//Classe Multiplicacao que estende a classe Operacao
class Multiplicacao extends Operacao {
 @Override
 int executa(int a, int b) {
     return a * b;
 }
}
