//Qual o resultado da variavel area ao final da execução desse programa:
//https://gist.github.com/jcbelarmino/df82d5068c7f143d37fa86f01b668146
//

package aula3;

public class AvaliacaoInstanceOf {
	    public static void main(String[] args) {
	        int nota = 0;

	        Forma forma1 = new Circulo();
	        Forma forma2 = new Retangulo();
	        Forma forma3 = new Triangulo();

	        if (forma1 instanceof Forma) {
	            nota += 2;
	        }
	        if (forma1 instanceof Circulo) {
	            nota += 2;
	        }
	        if (!(forma1 instanceof Retangulo)) {
	            nota += 2;
	        }

	        if (forma2 instanceof Forma) {
	            nota += 2;
	        }
	        if (!(forma2 instanceof Circulo)) {
	            nota += 2;
	        }
	        if (forma2 instanceof Retangulo) {
	            nota += 2;
	        }

	        if (forma3 instanceof Forma) {
	            nota += 2;
	        }
	        if (forma3 instanceof Circulo || forma3 instanceof Retangulo) {
	            nota += 2;
	        }

	        System.out.println("Nota final: " + nota);
	    }
	}
class Forma {
    // Classe base Forma
}

class Circulo extends Forma {
    // Classe Circulo, que herda de Forma
}

class Retangulo extends Forma {
    // Classe Retangulo, que herda de Forma
}

class Triangulo extends Forma {
    // Classe Triangulo, que herda de Forma
}