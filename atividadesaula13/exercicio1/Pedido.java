package atividadesaula13.exercicio1;

enum StatusPedido {
    NOVO,
    PROCESSANDO,
    ENVIADO,
    ENTREGUE
}

public class Pedido {
    private StatusPedido status;

    public Pedido() {
        this.status = StatusPedido.NOVO;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }
}
