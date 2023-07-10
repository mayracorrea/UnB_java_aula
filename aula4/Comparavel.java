//Comparação de Objetos Desafio:
//Crie uma interface chamada Comparavel com um método comparar(Comparavel
//outro). Em seguida, crie uma classe abstrata chamada ObjetoComparavel que
//implemente a interface Comparavel.
//Por fim, crie uma classe Aluno (atributos nome e idade) que herde de
//ObjetoComparavel e implemente o método comparar().
//Na classe Main, crie um array com 10 objetos Aluno e dois métodos com assinaturas
//public Aluno maxIdade(Aluno[] alunos){...} e public Aluno minIdade(Aluno[]
//alunos){...} que utilize o método comparar() para retornar os alunos com maior e
//menor idade.

package aula4;

public interface Comparavel {

    int comparar(Comparavel outro);
}

abstract class ObjetoComparavel implements Comparavel {
}

