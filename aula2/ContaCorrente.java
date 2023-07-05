//continuaçao
//Em seguida, crie uma classe "ContaCorrente" que herde da classe "Conta" e tenha um
//atributo privado limite (double) e um método para realizar um saque considerando o
//limite disponível. Utilize o encapsulamento e herança para implementar a
//funcionalidade
package aula2;

public class ContaCorrente extends Conta{ //herda de conta

	private double limite;

    public ContaCorrente(int numero, double limite) { // Construtor
        super(numero); //vem do pai
        this.limite = limite;
    }
//exibir ( get ) ou modificar ( set ) o valor de um atributo.
    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public boolean sacar(double valor) {
        if (valor <= (getSaldo() + limite)) {
            double saldoAtual = getSaldo();
            if (valor <= saldoAtual) {
                saldoAtual -= valor;
                setSaldo(saldoAtual);
            } else {
                limite -= (valor - saldoAtual);
                setSaldo(0.0);
            }
            System.out.println("Saque de R$" + valor + " realizado na conta corrente " + getNumero());
            return true;
        } else {
            System.out.println("Saldo insuficiente na conta corrente " + getNumero());
            return false;
        }
    }
	private void setSaldo(double saldoAtual) {
		// TODO Auto-generated method stub
		
	}
	
}