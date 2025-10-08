package atividadesaula10.exercicio1;

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
        try {
            System.out.println(dividir(10, 2)); // Exibe 5
            System.out.println(dividir(10, 0)); // Lança exceção
        } catch (DivisaoPorZeroException e) {
            System.out.println(e.getMessage());
        }
    }
}
