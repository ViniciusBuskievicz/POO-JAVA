package atividadesabstração.att03;
class Cliente {
     String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }
    public void exibirNome() {
        System.out.println("Cliente: " + nome);
    }
}
class Prato {
     String nome;
     double preco;

    public Prato(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void exibirPrato() {
        System.out.println("Prato: " + nome + " | Preço: R$ " + preco);
    }
}
class Pedido {
     Cliente cliente;
     Prato[] pratos;
     int quantidadePratos;

    public Pedido(Cliente cliente, int maxPratos) {
        this.cliente = cliente;
        this.pratos = new Prato[maxPratos];
        this.quantidadePratos = 0;
    }
    public void adicionarPrato(Prato prato) {
        if (quantidadePratos < pratos.length) {
            pratos[quantidadePratos] = prato;
            quantidadePratos++;
        }
    }
    public void exibirPedido() {
        cliente.exibirNome();
        System.out.println("Pratos do pedido:");
        for (int i = 0; i < quantidadePratos; i++) {
            pratos[i].exibirPrato();
        }
    }
}
public class Classes {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Vinicius");
        Pedido pedido = new Pedido(cliente, 2);

        pedido.adicionarPrato(new Prato("Lasanha", 25.0));
        pedido.adicionarPrato(new Prato("Pizza", 30.0));

        pedido.exibirPedido();
    }
}