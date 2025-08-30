package atividadesaula8.exercicio2;

public class Main {
    public static void main(String[] args) {
    
        Veiculo carro = new Carro("Hyundai", "Creta");
        Veiculo moto = new Moto("Yamaha", "DT 200");

        carro.exibirDados();
        carro.acelerar();

        moto.exibirDados();
        moto.acelerar();
    }
}