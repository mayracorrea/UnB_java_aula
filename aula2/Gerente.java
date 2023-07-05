//Em seguida, crie uma classe "Gerente"
//que herde da classe "Funcionario" e tenha um atributo privado departamento (String)
//e um método para calcular o bônus salarial. Utilize o encapsulamento e herança
//para implementar a funcionalidade.
package aula2;

public class Gerente extends Funcionario {
    private String departamento;

    public Gerente(String nome, double salario, String departamento) {
        super(nome, salario);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double calcularBonus() {
        return getSalario() * 0.1; // 10% do salário como bônus
    }
}
