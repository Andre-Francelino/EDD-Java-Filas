package estudos.java.estrutura.dados.RefatoracaoFila;

public class MainRefatorado {
    public static void main(String[] args) {

        FilaRefatorada filaObjetos = new FilaRefatorada();

        filaObjetos.enqueue("Objeto1");
        filaObjetos.enqueue("Objeto2");
        filaObjetos.enqueue("Objeto3");
        filaObjetos.enqueue("Objeto4");
        filaObjetos.enqueue(5);
        filaObjetos.enqueue("Objeto Falso");
        filaObjetos.enqueue(true);
        filaObjetos.enqueue(3.14);
        filaObjetos.enqueue(5/2f);
        System.out.println(filaObjetos);

        System.out.println(filaObjetos.first());
        System.out.println(filaObjetos);

        System.out.println(filaObjetos.dequeue());
        System.out.println(filaObjetos);

    }
}
