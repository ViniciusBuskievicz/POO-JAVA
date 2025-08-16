package exerciciosaula6;

class Forma {
    private String cor;
    private boolean preenchida;

    public Forma(String cor, boolean preenchida) {
        this.cor = cor;
        this.preenchida = preenchida;
    }

    public String getCor() {
        return cor;
    }

    public boolean isPreenchida() {
        return preenchida;
    }
}

class Retangulo extends Forma {
    private double largura;
    private double altura;

    public Retangulo(String cor, boolean preenchida, double largura, double altura) {
        super(cor, preenchida);
        this.largura = largura;
        this.altura = altura;
    }

    public double calcularArea() {
        return largura * altura;
    }
}

class Circulo extends Forma {
    private double raio;

    public Circulo(String cor, boolean preenchida, double raio) {
        super(cor, preenchida);
        this.raio = raio;
    }

    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}

public class Formas {
    public static void main(String[] args) {
        Retangulo ret = new Retangulo("Azul", true, 5.0, 3.0);
        Circulo circ = new Circulo("Vermelho", false, 2.0);

        System.out.println("Área do Retângulo: " + ret.calcularArea());
        System.out.println("Área do Círculo: " + circ.calcularArea());
    }
}
