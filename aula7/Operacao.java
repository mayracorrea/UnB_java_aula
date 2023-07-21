package aula7;

//Classe abstrata Operacao
abstract class Operacao {
 abstract int executa(int a, int b);

protected abstract int executa(int numero1, int numero2);
}

//Classe Subtracao que estende a classe Operacao
class Subtracao extends Operacao {
 @Override
 int executa(int a, int b) {
     return a - b;
 }
}

