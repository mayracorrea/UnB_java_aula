package aula7;

//Classe Percent que estende a classe Operacao
class Percent extends Operacao {
 @Override
 int executa(int percentagem, int valorTotal) {
     return (percentagem * valorTotal) / 100;
 }
}

