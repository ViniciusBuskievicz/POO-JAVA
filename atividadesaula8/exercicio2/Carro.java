package atividadesaula8.exercicio1.exercicio2;

class Carro extends Veiculo {
    public Carro(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void acelerar() {
        System.out.println("O carro está acelerando...");
    }
}