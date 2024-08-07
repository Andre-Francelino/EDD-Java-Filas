package estudos.java.estrutura.dados.ExemplosExtras;

public class FilaDeAtendimento {
    public static void main(String[] args) {
        // Criando fila de senhas para atendimento
        FilaGenerica<String> filaSenhas = new FilaGenerica<>();

        // Entregando senhas aos clientes
        filaSenhas.enqueue("A001");
        filaSenhas.enqueue("B001");
        filaSenhas.enqueue("C001");
        filaSenhas.enqueue("D001");
        filaSenhas.enqueue("E001");

        // Processando fila de atendimento
        while (!filaSenhas.isEmpty()) {
            System.out.println("Aguardando Atendimento: " + filaSenhas);
            System.out.println("A senha " + filaSenhas.peek() + " foi chamada..." );
            System.out.println("Atendendo a senha: " + filaSenhas.dequeue());
            System.out.println("Senhas restantes na fila: " + filaSenhas.size());

            if (!filaSenhas.isEmpty()) {
                System.out.println("Próxima senha a ser chamada: " + filaSenhas.peek() + "\n");
            } else {
                System.out.println("Não há mais senhas na fila. \n");
            }
        }
        System.out.println("Todos os atendimentos foram realizados!");
    }
}
