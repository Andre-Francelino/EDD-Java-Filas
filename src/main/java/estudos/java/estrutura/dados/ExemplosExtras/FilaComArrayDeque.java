package estudos.java.estrutura.dados.ExemplosExtras;

import java.util.ArrayDeque;
import java.util.Queue;

public class FilaComArrayDeque {
    public static void main(String[] args) {
        Queue<Integer> fila = new ArrayDeque<>();

        // ENQUEUE: Adicionando elementos no final da fila
        fila.add(160492);
        fila.add(100100);
        fila.add(160198);
        System.out.println("A fila contém os elementos: " + fila);
        // PEEK: Retornando o primeiro elemento da fila
        System.out.println("Atualmente o 1º elemento é: " + fila.peek());
        System.out.println("O tamanho da fila é de " + fila.size() + " elementos. \n");


        // DEQUEUE: Removendo elementos no início da fila
        System.out.println("Removendo atual 1º elemento: " + fila.remove());
        System.out.println("A fila contém os elementos: " + fila);
        System.out.println("Atualmente o 1º elemento é: " + fila.peek());
        System.out.println("O tamanho da fila é de " + fila.size() + " elementos. \n");

        // Verificando se a fila está vazia
        System.out.println("A fila encontra-se vazia? " + fila.isEmpty() + "\n");

        System.out.println("Removendo atual 1º elemento: " + fila.remove());
        System.out.println("A fila contém os elementos: " + fila);
        System.out.println("Atualmente o 1º elemento é: " + fila.peek());
        System.out.println("O tamanho da fila é de " + fila.size() + " elementos. \n");

        System.out.println("A fila encontra-se vazia? " + fila.isEmpty() + "\n");

        System.out.println("Removendo atual 1º elemento: " + fila.remove());
        System.out.println("A fila contém os elementos: " + fila);
        System.out.println("Atualmente o 1º elemento é: " + fila.peek());
        System.out.println("O tamanho da fila é de " + fila.size() + " elementos. \n");

        System.out.println("A fila encontra-se vazia? " + fila.isEmpty() + "\n");

    }
}
