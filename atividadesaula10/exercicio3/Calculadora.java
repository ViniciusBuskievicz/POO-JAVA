package atividadesaula10.exercicio3;

import java.util.Scanner;

class DivisaoPorZeroException extends Exception {
    public DivisaoPorZeroException(String mensagem) {
        super(mensagem);
    }
}

public class Calculadora {
    public static int dividir(int a, int b) throws DivisaoPorZeroException {
        if (b == 0) {
            throw new DivisaoPorZeroException("Erro: divisão por zero!");
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int a = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int b = scanner.nextInt();

        try {
            int resultado = dividir(a, b);
            System.out.println("Resultado da divisão: " + resultado);
        } catch (DivisaoPorZeroException e) {
            System.out.println(e.getMessage());
        }
        scanner.close();
    }
}
