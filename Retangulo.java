package aula3;

public class Retangulo extends Forma {
    private double largura;
    private double altura;
    
    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    
    
   this.largura = 2;
   this.altura = 4;
    }
	public Retangulo(int largura2, int altura2) {
		// TODO Auto-generated constructor stub
	}

	@Override
    public double calcularArea() {
        return largura * altura;
    }
}

