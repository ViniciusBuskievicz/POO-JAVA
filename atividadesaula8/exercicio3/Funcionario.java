package atividadesaula8.exercicio3;

abstract class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public abstract double calcularBonus();

    public void exibirDados() {
        System.out.println("Nome: " + nome + " | Salário: " + salario);
    }
}