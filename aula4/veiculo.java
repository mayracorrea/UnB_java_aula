
//Criação de classes abstratas Implemente uma classe abstrata chamada "Veiculo"
//que contenha os seguintes métodos abstratos:
//● acelerar(int velocidade): acelera o veículo para a velocidade
//especificada.
//● frear(): realiza a frenagem do veículo. Crie duas classes derivadas de
//"Veiculo" chamadas "Carro" e "Moto". Implemente os métodos abstratos de
//acordo com o comportamento esperado para cada tipo de veículo. Em
//seguida, crie instâncias de Carro e Moto e teste os métodos implementados.
package aula4;

abstract class veiculo {
	//Criacao dos metodos acelerar e freiar

    abstract void acelerar(int velocidade);
    abstract void frear();
}

class Carro extends veiculo {
   
	//garantir que seja sobrescrito o metodo acelerar e não criando um novo.
	@Override
    void acelerar(int velocidade) {
        System.out.println("Carro acelerando para " + velocidade + " km/h");
    }
	//garantir que seja sobrescrito o metodo frear e não criando um novo.
    @Override
    void frear() {
        System.out.println("Carro freando");
    }
}

class Moto extends veiculo {
    @Override
    void acelerar(int velocidade) {
        System.out.println("Moto acelerando para " + velocidade + " km/h");
    }

    @Override
    void frear() {
        System.out.println("Moto freando");
    }
}


