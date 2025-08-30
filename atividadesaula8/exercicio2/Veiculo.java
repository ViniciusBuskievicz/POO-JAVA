package atividadesaula8.exercicio1.exercicio2;

abstract class Veiculo {
    protected String marca;
    protected String modelo;

    public Veiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public abstract void acelerar();

    public void exibirDados() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo);
    }
}