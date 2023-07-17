package aula6;

/*
 * public class Pilha<T> { private T[] elementos; private int topo; private int
 * tamanho; private int capacidade;
 * 
 * //Construtor que recebe o tamanho do array elementos como parâmetro
 * 
 * @SuppressWarnings("unchecked") public Pilha(int capacidade) { //coloque o
 * código de inicialização do array elementos aqui, não esqueça de iniciar o
 * topo também this.elementos = (T[]) new Object[capacidade]; this.tamanho = 0;
 * this.capacidade = capacidade; //… }
 * 
 * //recebe um elemento e adiciona na pilha, se a pilha atingiu a capacidade
 * máxima, ou seja o array está completo, lance uma exceção: throw new
 * IllegalStateException("A pilha está cheia."); public void push(T elemento) {
 * //chame o método isFull() para testar se a pilha está cheia // se não estiver
 * cheia adicione o elemento ao array e atualize o topo // …
 * 
 * if (tamanho >= capacidade) { throw new
 * IllegalStateException("A pilha está cheia."); } elementos[tamanho] =
 * elemento; tamanho++; } // retira um elemento do topo da pilha, se a pilha
 * estiver vazia lance uma exceção: throw new
 * IllegalStateException("A pilha está vazia."); public T pop() {
 * 
 * // chame o método isEmpty() para verificar se a pilha está vazia // se não
 * estiver vazia retorne o elemento do topo, remova o elemento do array e
 * atualize o topo // … if (tamanho <= 0) { throw new
 * IllegalStateException("A pilha está vazia."); } tamanho--; T elemento =
 * elementos[tamanho]; elementos[tamanho] = null; return elemento; }
 * 
 * //retorna o elemnto do topo sem remover do array, se a pilha estiver vazia
 * lance uma exceção: throw new IllegalStateException("A pilha está vazia.");
 * public T peek() { //… if (tamanho <= 0) { throw new
 * IllegalStateException("A pilha está vazia."); } tamanho--; T elemento =
 * elementos[tamanho]; elementos[tamanho] = null; return elemento; } // método
 * que checa se a pilha está vazia public boolean isEmpty() { return tamanho ==
 * 0; } //método que checa se a pilha está cheia public void isFull() { if
 * (tamanho >= capacidade) { throw new
 * IllegalStateException("A pilha está cheia."); } T elemento = null;
 * elementos[tamanho] = elemento; tamanho++; }
 * 
 * // //retorna quantos elementos estão na pilha, não é o tamanho do array
 * public int size() { return tamanho; } }
 */

public class Pilha<T> {
    private T[] elementos;
    private int tamanho;
    private int capacidade;

    @SuppressWarnings("unchecked")
    public Pilha(int capacidade) {
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
        this.capacidade = capacidade;
    }

    public void empilhar(T elemento) {
        if (tamanho >= capacidade) {
            throw new IllegalStateException("A pilha está cheia.");
        }
        elementos[tamanho] = elemento;
        tamanho++;
    }

    public T desempilhar() {
        if (tamanho <= 0) {
            throw new IllegalStateException("A pilha está vazia.");
        }
        tamanho--;
        T elemento = elementos[tamanho];
        elementos[tamanho] = null;
        return elemento;
    }

    public T topo() {
        if (tamanho <= 0) {
            throw new IllegalStateException("A pilha está vazia.");
        }
        return elementos[tamanho - 1];
    }

    public boolean vazia() {
        return tamanho == 0;
    }

    public int tamanho() {
        return tamanho;
    }
}

