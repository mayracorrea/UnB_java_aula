package aula7;

//Classe Exponenciacao que estende a classe Operacao
class Exponenciacao extends Operacao {
 @Override
 int executa(int base, int expoente) {
     int resultado = 1;
     for (int i = 0; i < expoente; i++) {
         resultado *= base;
     }
     return resultado;
 }
}

