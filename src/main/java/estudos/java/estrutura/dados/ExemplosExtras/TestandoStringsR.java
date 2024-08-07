package estudos.java.estrutura.dados.ExemplosExtras;

public class TestandoStringsR {

    public static void main(String[] args) {
        // Criando fila de elementos do tipo Strings
        FilaGenerica<String> filaTecnologias = new FilaGenerica<>();

        // adicionando elementos
        filaTecnologias.enqueue("Java");
        filaTecnologias.enqueue("MySQL");
        filaTecnologias.enqueue("C#");
        filaTecnologias.enqueue("Ruby");
        filaTecnologias.enqueue("Python");
        filaTecnologias.enqueue("NestJS");
        filaTecnologias.enqueue("Django");
        filaTecnologias.enqueue("ChatGPT");
        filaTecnologias.enqueue("Pandas");

        if (filaTecnologias.isEmpty()) {
            System.out.println("A fila está vazia!");
        } else {
            while (!filaTecnologias.isEmpty()) {
                System.out.println("A fila de tecnologias atualmente é: " + filaTecnologias);
                System.out.println("O atual primeiro elemento da fila é: " + filaTecnologias.peek());
                System.out.println("O tamanho atual da fila é: " + filaTecnologias.size());
                System.out.println("Removendo o atual primeiro elemento: " + filaTecnologias.dequeue() + "\n");
            }
            System.out.println("Aqui termina o teste no loop!");
        }
        
    }
}
