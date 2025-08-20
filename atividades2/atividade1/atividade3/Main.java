package atividades2.atividade3;

public class Main {
    public static void main(String[] args) {
        Departamento ti = new Departamento("TI");
        Departamento rh = new Departamento("RH");

        Funcionario f1 = new Funcionario("Alisson", 3000, ti);
        Funcionario f2 = new Funcionario("Aline", 2500, rh);
        Funcionario f3 = new Funcionario("Vinicius", 3200, ti);

        ti.adicionarFuncionario(f1);
        ti.adicionarFuncionario(f3);
        rh.adicionarFuncionario(f2);

        ti.listarFuncionarios();
        rh.listarFuncionarios();
    }
}