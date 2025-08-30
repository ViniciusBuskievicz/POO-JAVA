package atividadesaula8.exercicio3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new Gerente("Vinicius", 8000.00));
        funcionarios.add(new Vendedor("Aline", 3000.00));
        funcionarios.add(new Vendedor("Alisson", 3500.00));

        for (Funcionario f : funcionarios) {
            f.exibirDados();
            System.out.println("Bônus: R$ " + f.calcularBonus());
            System.out.println("---------------------------");
        }
    }
}