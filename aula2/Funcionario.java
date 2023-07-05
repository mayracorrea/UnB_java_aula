//Crie uma classe "Funcionario" com atributos privados nome (String) e salario
//(double), além de métodos getters e setters. Em seguida, crie uma classe "Gerente"
//que herde da classe "Funcionario" e tenha um atributo privado departamento (String)
//e um método para calcular o bônus salarial. Utilize o encapsulamento e herança
//para implementar a funcionalidade


package aula2;

public class Funcionario {
    private String nome;
    private double salario;

    //construtor
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}

