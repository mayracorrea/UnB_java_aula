//Em seguida, crie uma classe "CadastroAlunos" com o método main() para testar a
//classe "Aluno". No método main(), crie dois objetos Aluno utilizando os construtores
//diferentes e exiba as informações dos alunos criados.

package aula2;

import aula2.Aluno;

public class CadastrarAluno {

    public static void main(String[] args) {
        // Criando objetos Aluno utilizando construtores diferentes
        Aluno aluno1 = new Aluno(); // Construtor padrão
        Aluno aluno2 = new Aluno("João", "20210001", "Engenharia");

        // Exibindo as informações dos alunos criados
        System.out.println("Informações do Aluno 1:");
        aluno1.exibirInformacoes();

        System.out.println("\nInformações do Aluno 2:");
        aluno2.exibirInformacoes();
    }
}
