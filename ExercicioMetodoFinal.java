//O que ocorre ao compilar e executar esse código?
//https://gist.github.com/jcbelarmino/af3379fbc2f91ec1efba439b425b9035
//Em caso de erro como corrigir?


package aula3;

public class ExercicioMetodoFinal {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(5, 10);
        retangulo.exibirInformacoes();
        retangulo.calcularArea();
    }
}

class Forma {
    public void exibirInformacoes() {
        System.out.println("Esta é uma forma geométrica.");
    }
}

class Retangulo extends Forma {
    private int largura;
    private int altura;

    public Retangulo(int largura, int altura) {
        this.largura = largura;
        this.altura = altura;
    }

 
    public void exibirInformacoes() {
        System.out.println("Este é um retângulo com largura " + largura + " e altura " + altura + ".");
    }

    public void calcularArea() {
        int area = largura * altura;
        System.out.println("A área do retângulo é: " + area);
    }
}
