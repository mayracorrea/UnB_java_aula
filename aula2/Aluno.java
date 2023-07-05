//
//Crie uma classe chamada "Aluno" que represente um aluno de uma instituição de
//ensino. O aluno deve possuir os seguintes atributos privados: nome (String),
//matricula (String) e curso (String).
//Implemente os seguintes construtores na classe "Aluno":1. Construtor padrão: não recebe nenhum parâmetro e inicializa todos os
//atributos com valores padrão.
//2. Construtor com parâmetros: recebe os valores para nome, matricula e curso e
//inicializa os atributos correspondentes.
//Além disso, crie um método para exibir as informações do aluno (nome, matricula e
//curso)


package aula2;


public class Aluno {
    private String nome;
    private String matricula;
    private String curso;

    public Aluno() {
        this.nome = "";
        this.matricula = "";
        this.curso = "";
    }

    public Aluno(String nome, String matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Curso: " + curso);
    }
}
