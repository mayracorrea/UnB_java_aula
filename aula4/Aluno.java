package aula4;

public class Aluno extends ObjetoComparavel {
    private String nome;
    private int idade;

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public int comparar(Comparavel outro) {
        if (outro instanceof Aluno) {
            Aluno outroAluno = (Aluno) outro;
            if (this.idade < outroAluno.idade) {
                return -1;
            } else if (this.idade > outroAluno.idade) {
                return 1;
            } else {
                return 0;
            }
        } else {
            throw new IllegalArgumentException("O objeto passado não é um Aluno.");
        }
    }

    public static Aluno maxIdade(Aluno[] alunos) {
        Aluno maxAluno = alunos[0];
        for (int i = 1; i < alunos.length; i++) {
            if (alunos[i].comparar(maxAluno) > 0) {
                maxAluno = alunos[i];
            }
        }
        return maxAluno;
    }

    public static Aluno minIdade(Aluno[] alunos) {
        Aluno minAluno = alunos[0];
        for (int i = 1; i < alunos.length; i++) {
            if (alunos[i].comparar(minAluno) < 0) {
                minAluno = alunos[i];
            }
        }
        return minAluno;
    }
}   