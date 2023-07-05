//Crie uma classe "Conta" que represente uma conta bancária com atributos privados
//número (int) e saldo (double), além de métodos para depositar e sacar dinheiro. Em
//seguida, crie uma classe "ContaCorrente" que herde da classe "Conta" e tenha um
//atributo privado limite (double) e um método para realizar um saque considerando o
//limite disponível. Utilize o encapsulamento e herança para implementar a
//funcionalidade.
package aula2;

public class Conta {
 private int numero;
 private double saldo;
 
 public Conta (int numero) {
	 this.numero = numero;
	 this.saldo = saldo;
	 this.saldo = 0.0; }
 
public int getNumero() {
     return numero;
 }
 
 public double getSaldo() {
     return saldo;
 }

public void depositarDiheiro(double valor) {
	  saldo += valor; 
	  System.out.println("Depósito de R$" + valor + " realizado na conta " + numero);
}
public boolean sacarDinheiro(double valor) {
	
	if (valor <= saldo) {
        saldo -= valor;
        System.out.println("Saque de R$" + valor + " realizado na conta " + numero);
        return true;
    } else {
        System.out.println("Saldo insuficiente na conta " + numero);
        return false;
    }
}

public boolean sacar(double valor) {
	// TODO Auto-generated method stub
	return false;
}
}



