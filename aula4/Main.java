package aula4;
//
//public class Main {
//
//    public static void main(String[] args) {
//        //é usado para criar uma nova instância de uma classe, no caso carro/moto, ou seja, ele é usado para criar objetos
//    	
//    	Carro carro = new Carro();
//        carro.acelerar(80);
//        carro.frear();
//
//        Moto moto = new Moto();
//        moto.acelerar(60);
//        moto.frear();
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        MP3Player mp3Player = new MP3Player();
//        mp3Player.abrir("musica.mp3");
//        mp3Player.reproduzir();
//        mp3Player.pausar();
//        mp3Player.parar();
//
//        WAVPlayer wavPlayer = new WAVPlayer();
//        wavPlayer.abrir("audio.wav");
//        wavPlayer.reproduzir();
//        wavPlayer.pausar();
//        wavPlayer.parar();
//    }
//}

//public class Main extends Aluno{
//    public Main(String nome, int idade) {
//		super(nome, idade);
//		// TODO Auto-generated constructor stub
//	}
//
//	public static void main(String[] args) {
//        Aluno[] alunos = new Aluno[10];
//        alunos[0] = new Aluno("Maria", 18);
//        alunos[1] = new Aluno("João", 20);
//        alunos[2] = new Aluno("Pedro", 19);
//        alunos[3] = new Aluno("Ana", 21);
//        alunos[4] = new Aluno("Luiza", 17);
//        alunos[5] = new Aluno("Lucas", 22);
//        alunos[6] = new Aluno("Carla", 19);
//        alunos[7] = new Aluno("Miguel", 18);
//        alunos[8] = new Aluno("Isabela", 20);
//        alunos[9] = new Aluno("Rafael", 21);
//
//        Aluno alunoMaisVelho = maxIdade(alunos);
//        Aluno alunoMaisNovo = minIdade(alunos);
//
//        System.out.println("Aluno mais velho: " + alunoMaisVelho.getNome() + " - " + alunoMaisVelho.getIdade() + " anos");
//        System.out.println("Aluno mais novo: " + alunoMaisNovo.getNome() + " - " + alunoMaisNovo.getIdade() + " anos");
//    }
//
//	}
//
//public class Main {
//    public static void main(String[] args) {
//        Quadrado quadrado = new Quadrado(5);
//        System.out.println("Área do quadrado: " + quadrado.calcularArea());
//        System.out.println("Perímetro do quadrado: " + quadrado.calcularPerimetro());
//
//        Circulo circulo = new Circulo(3);
//        System.out.println("Área do círculo: " + circulo.calcularArea());
//        System.out.println("Perímetro do círculo: " + circulo.calcularPerimetro());
//
//        Triangulo triangulo = new Triangulo(4, 3, 5, 4, 3);
//        System.out.println("Área do triângulo: " + triangulo.calcularArea());
//        System.out.println("Perímetro do triângulo: " + triangulo.calcularPerimetro());
//    }
//}



public class Main {
    public static void main(String[] args) {
        ProcessadorPagamento cartao = new PagamentoCartao();
        cartao.processarPagamento(100.50);

        ProcessadorPagamento boleto = new PagamentoBoleto();
        boleto.processarPagamento(250.75);
    }
}

