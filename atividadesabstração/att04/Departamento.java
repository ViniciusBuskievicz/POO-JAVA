package atividadesabstração.att04;
class Funcionario {
    String nome;
    Departamento departamento;

    public Funcionario(String nome, Departamento departamento) {
        this.nome = nome;
        this.departamento = departamento;
    }
    public void exibirFuncionario() {
        System.out.println("Funcionário: " + nome + " | Departamento: " + departamento.getNome());
    }
}
public class Departamento {
    String nome;
    Funcionario[] funcionarios;
    int quantidade;

    public Departamento(String nome) {
        this.nome = nome;
        this.funcionarios = new Funcionario[10]; 
        this.quantidade = 0;
    }
    public String getNome() {
        return nome;
    }
    public void adicionarFuncionario(Funcionario funcionario) {
        if (quantidade < funcionarios.length) {
            funcionarios[quantidade] = funcionario;
            quantidade++;
        }
    }
    public void exibirDepartamento() {
        System.out.println("Departamento: " + nome);
        System.out.println("Funcionários:");
        for (int i = 0; i < quantidade; i++) {
            funcionarios[i].exibirFuncionario();
        }
    }
    public static void main(String[] args) {
        Departamento departamento = new Departamento("TI");

        Funcionario f1 = new Funcionario("Jonas", departamento);
        Funcionario f2 = new Funcionario("Julia", departamento);
        Funcionario f3 = new Funcionario("João", departamento);

        departamento.adicionarFuncionario(f1);
        departamento.adicionarFuncionario(f2);
        departamento.adicionarFuncionario(f3);

        departamento.exibirDepartamento();
    }
}