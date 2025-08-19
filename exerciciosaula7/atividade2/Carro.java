package exerciciosaula7.atividade2;

public class Carro extends Veiculo {
    public Carro(String nome) {
        super(nome);
    }

    @Override
    public void mover() {
        System.out.println("O carro " + getNome() + " está se movendo.");
    }
}