package atividadesabstração.att08;
public class Celular {
    String marca;
    String modelo;
    String numeroSerie;

    public Celular(String marca, String modelo, String numeroSerie) {
        this.marca = marca;
        this.modelo = modelo;
        this.numeroSerie = numeroSerie;
    }
    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Número de Série: " + numeroSerie);
    }
    public static void main(String[] args) {
        Celular celular = new Celular("Samsung", "Galaxy A72", "RQ8R40000AP");
        celular.exibirInformacoes();
    }
}