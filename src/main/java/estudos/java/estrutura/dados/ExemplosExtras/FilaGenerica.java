package estudos.java.estrutura.dados.ExemplosExtras;

import java.util.LinkedList;
import java.util.Queue;

public class FilaGenerica<T> {
    private Queue<T> fila;

    // Construtor
    public FilaGenerica() {
        this.fila = new LinkedList<>();
    }

    // Enqueue: Adiciona um elemento à fila
    public void enqueue(T elemento) {
        fila.add(elemento);
    }

    // Dequeue: Remove e retorna o primeiro elemento da fila
    public T dequeue() {
        return fila.poll(); // retorna null se a fila estiver vazia
    }

    // Peek: Retorna o primeiro elemento sem removê-lo
    public T peek() {
        return fila.peek();
    }

    // Verifica se a fila está vazia
    public boolean isEmpty() {
        return fila.isEmpty();
    }

    // Retorna o tamanho da fila
    public int size() {
        return fila.size();
    }

    // Exibe os elementos da Fila
    @Override
    public String toString() {
        return fila.toString();
    }
}
