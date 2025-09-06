package exerciciosaula9.exercicio1;
public class Circulo implements FormaGeometrica{
    
    private double raio;

    public Circulo(double raio){
        this.raio = raio;
    }

    @Override
    public double CalcularArea(){
        return Math.PI * raio * raio;
    }

}