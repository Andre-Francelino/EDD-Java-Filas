package estudos.java.estrutura.dados.ExemplosExtras;

public class TestandoStrings {

    public static void main(String[] args) {
        // Criando fila de elementos do tipo Strings
        FilaGenerica<String> filaStrings = new FilaGenerica<>();

        // adicionando elementos
        filaStrings.enqueue("Java");
        filaStrings.enqueue("JS");
        filaStrings.enqueue("Golang");

        System.out.println("A fila de strings está vazia? " + filaStrings.isEmpty());
        System.out.println("A fila de strings atualmente é: " + filaStrings);
        System.out.println("O atual primeiro da fila é: " + filaStrings.peek());
        System.out.println("O tamanho atual da fila é: " + filaStrings.size() + "\n");

        System.out.println("Removendo o atual primeiro elemento: " + filaStrings.dequeue());

        System.out.println("A fila de strings está vazia? " + filaStrings.isEmpty());
        System.out.println("A fila de strings atualmente é: " + filaStrings);
        System.out.println("O atual primeiro da fila é: " + filaStrings.peek());
        System.out.println("O tamanho atual da fila é: " + filaStrings.size() + "\n");

        System.out.println("Removendo o atual primeiro elemento: " + filaStrings.dequeue());

        System.out.println("A fila de strings está vazia? " + filaStrings.isEmpty());
        System.out.println("A fila de strings atualmente é: " + filaStrings);
        System.out.println("O atual primeiro da fila é: " + filaStrings.peek());
        System.out.println("O tamanho atual da fila é: " + filaStrings.size() + "\n");

        System.out.println("Removendo o atual primeiro elemento: " + filaStrings.dequeue());

        System.out.println("A fila de strings está vazia? " + filaStrings.isEmpty());
        System.out.println("A fila de strings atualmente é: " + filaStrings);
        System.out.println("O atual primeiro da fila é: " + filaStrings.peek());
        System.out.println("O tamanho atual da fila é: " + filaStrings.size() + "\n");

    }
}
