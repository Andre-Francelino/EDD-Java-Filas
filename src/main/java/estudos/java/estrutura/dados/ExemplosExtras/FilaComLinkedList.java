package estudos.java.estrutura.dados.ExemplosExtras;

import java.util.LinkedList;
import java.util.Queue;

public class FilaComLinkedList {
    public static void main(String[] args) {
        Queue<Integer> fila = new LinkedList<>();

        // ENQUEUE: Adicionando elementos no final da fila
        fila.add(27);
        fila.add(89);
        fila.add(974);
        fila.add(743);

        System.out.println("A fila atualmente está assim: " + fila);
        // Retornando o primeiro elemento da fila
        System.out.println("No momento o primeiro elemento da fila é: " + fila.peek() + "\n");


        // DEQUEUE: Removendo elementos no início da fila
        System.out.println("Removendo o elemento: " + fila.remove());
        System.out.println("A fila atualmente está assim: " + fila);
        // Retornando o primeiro elemento da fila
        System.out.println("No momento o primeiro elemento da fila é: " + fila.peek() + "\n");

        // Verificando se a fila está vazia
        System.out.println("A fila está vazia? " + fila.isEmpty() + "\n");

        // Retornando o tamanho da fila
        System.out.println("O tamanho da fila é: " + fila.size()  + "\n");

    }
}
