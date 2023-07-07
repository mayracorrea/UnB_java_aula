
//Exercício 1:
//Considere as classes Veiculo, Carro e Moto. A classe Veiculo método acelerar(). As classes Carro e Moto herdam da classe Veiculo e implementam o método acelerar() para exibir a velocidade máxima atingida por cada veículo.
//Crie uma instância de Carro e uma instância de Moto. Chame o método acelerar() para cada uma delas e exiba o resultado.


package aula3;

public class Veiculo {
    public void acelerar() {
        System.out.println("Acelerando veículo...");
    }
}

class Carro extends Veiculo {
    @Override
    public void acelerar() {
        System.out.println("Carro acelerando a uma velocidade máxima de 200 km/h.");
    }
}

class Moto extends Veiculo {
    @Override
    public void acelerar() {
        System.out.println("Moto acelerando a uma velocidade máxima de 180 km/h.");
    }
}

