package exerciciosaula6;

public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("João", 5000.0, "Financeiro");
        System.out.println("Nome: " + gerente.getNome());
        System.out.println("Salário: " + gerente.getSalario());
        System.out.println("Setor: " + gerente.getSetor());
    }
}