package atividadesabstração.att07;
class Quarto {
    int numero;
    String tipo;
    String status;

    public Quarto(int numero, String tipo, String status) {
        this.numero = numero;
        this.tipo = tipo;
        this.status = status;
    }
    public void exibirDados() {
        System.out.println("Quarto: " + numero + " | Tipo: " + tipo + " | Status: " + status);
    }
}
class Hospede {
    String nome;
    String documento;
    public Hospede(String nome, String documento) {
        this.nome = nome;
        this.documento = documento;
    }
    public void exibirDados() {
        System.out.println("Hóspede: " + nome + " | Documento: " + documento);
    }
}
class Reserva {
    Quarto quarto;
    Hospede hospede;
    String dataEntrada;
    String dataSaida;

    public Reserva(Quarto quarto, Hospede hospede, String dataEntrada, String dataSaida) {
        this.quarto = quarto;
        this.hospede = hospede;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
    }
    public void exibirDados() {
        System.out.println("Reserva:");
        quarto.exibirDados();
        hospede.exibirDados();
        System.out.println("Data de entrada: " + dataEntrada);
        System.out.println("Data de saída: " + dataSaida);
    }
}
public class Hotel {
    public static void main(String[] args) {
        Quarto quarto = new Quarto(237, "Solteiro", "Disponível");
        Hospede hospede = new Hospede("Vinicius", "116.001.729-89");
        Reserva reserva = new Reserva(quarto, hospede, "14/10/2025", "20/10/2025");

        reserva.exibirDados();
    }
}