package estudos.java.estrutura.dados.ExemplosExtras;

public class TestandoInteiros {
    public static void main(String[] args) {

        // Criando fila de elementos do tipo Inteiro
        FilaGenerica<Integer> filaInteiros = new FilaGenerica<>();

        // adicionando elementos
        filaInteiros.enqueue(1);
        filaInteiros.enqueue(5);
        filaInteiros.enqueue(777);

        System.out.println("A fila de inteiros está vazia? " + filaInteiros.isEmpty());
        System.out.println("A fila de inteiros atualmente é: " + filaInteiros);
        System.out.println("O atual primeiro da fila é: " + filaInteiros.peek());
        System.out.println("O tamanho atual da fila é: " + filaInteiros.size() + "\n");

        System.out.println("Removendo o atual primeiro elemento: " + filaInteiros.dequeue());

        System.out.println("A fila de inteiros está vazia? " + filaInteiros.isEmpty());
        System.out.println("A fila de inteiros atualmente é: " + filaInteiros);
        System.out.println("O atual primeiro da fila é: " + filaInteiros.peek());
        System.out.println("O tamanho atual da fila é: " + filaInteiros.size() + "\n");

        System.out.println("Removendo o atual primeiro elemento: " + filaInteiros.dequeue());

        System.out.println("A fila de inteiros está vazia? " + filaInteiros.isEmpty());
        System.out.println("A fila de inteiros atualmente é: " + filaInteiros);
        System.out.println("O atual primeiro da fila é: " + filaInteiros.peek());
        System.out.println("O tamanho atual da fila é: " + filaInteiros.size() + "\n");

        System.out.println("Removendo o atual primeiro elemento: " + filaInteiros.dequeue());

        System.out.println("A fila de inteiros está vazia? " + filaInteiros.isEmpty());
        System.out.println("A fila de inteiros atualmente é: " + filaInteiros);
        System.out.println("O atual primeiro da fila é: " + filaInteiros.peek());
        System.out.println("O tamanho atual da fila é: " + filaInteiros.size() + "\n");

        System.out.println("Removendo o atual primeiro elemento: " + filaInteiros.dequeue());

        System.out.println("A fila de inteiros está vazia? " + filaInteiros.isEmpty());
        System.out.println("A fila de inteiros atualmente é: " + filaInteiros);
        System.out.println("O atual primeiro da fila é: " + filaInteiros.peek());
        System.out.println("O tamanho atual da fila é: " + filaInteiros.size() + "\n");

    }
}
