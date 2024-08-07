package estudos.java.estrutura.dados.RefatoracaoFilaGenerics;

public class MainGenerics {
    public static void main(String[] args) {

        // criando uma fila de objetos do tipo String
        FilaGenerics<String> filaStrings = new FilaGenerics<>();

        filaStrings.enqueue("String 1");
        filaStrings.enqueue("String 2");
        filaStrings.enqueue("String 3");
        filaStrings.enqueue("String 4");
        System.out.println(filaStrings);

        System.out.println(filaStrings.first());
        System.out.println(filaStrings);

        System.out.println(filaStrings.dequeue());
        System.out.println(filaStrings + "\n");

        // criando uma fila de objetos do tipo inteiros
        FilaGenerics<Integer> filaInteiros = new FilaGenerics<Integer>();

        filaInteiros.enqueue(5);
        filaInteiros.enqueue(4);
        filaInteiros.enqueue(3);
        filaInteiros.enqueue(2);
        filaInteiros.enqueue(1);
        System.out.println("exibindo a fila criada: \n" + filaInteiros);

        System.out.println("exibindo o primeiro objeto da fila sem exclui-lo: \n" + filaInteiros.first());
        System.out.println("exibindo a fila criada: \n" + filaInteiros);

        System.out.println("retirando o primeiro objeto da fila: " + filaInteiros.dequeue());
        System.out.println("exibindo a fila agora com outro primeiro objeto: \n" + filaInteiros + "\n");

    }
}
