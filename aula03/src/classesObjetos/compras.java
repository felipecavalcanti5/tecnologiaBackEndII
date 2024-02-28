package classesObjetos;

public class compras {
    String descricao;
    double valor;
    int quantidade;

    public compras(String descricao, double valor, int quantidade) {
        this.descricao = descricao;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public double total(){
        return valor * quantidade;
    }

    public static void main(String[] args) {
        compras obj1 = new compras("sabonete", 56,43);

        System.out.println(obj1.total());
    }
}
