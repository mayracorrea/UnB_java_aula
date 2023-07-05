//Exercício 1: Criação de uma classe "Círculo"
//Crie uma classe chamada "Círculo" que represente um círculo com raio. A classe
//deve ter os seguintes atributos privados: raio (double). Implemente métodos para
//calcular a área e o perímetro do círculo. Deve herdar da classe Curso_java_unb/src/aula3oo/heranca/Forma.java
package aula2;



public class Circulo extends Forma{ //herda de forma

// atributo privado chamado raio
private double raio;

public Circulo(double raio) { //construtor
this.raio = raio; //variavel local
}
//metodo calcular area
public double calcularArea() {
return Math.PI * Math.pow(raio, 2);
}
//metodo calcular perimetro
public double calcularPerimetro() {
return 2 * Math.PI * raio;
}
   
}
