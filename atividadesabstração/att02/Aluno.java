package atividadesabstração.att02;
public class Aluno {
    String nome;
    String matricula;
    float[] notas;
    int quantidadeNotas;
    
    public Aluno(String nome, String matricula, int maxNotas) {
        this.nome = nome;
        this.matricula = matricula;
        this.notas = new float[maxNotas];
        this.quantidadeNotas = 0;
    }
    public void adicionarNota(float nota) {
        if (quantidadeNotas < notas.length) {
            notas[quantidadeNotas] = nota;
            quantidadeNotas++;
        } else {
            System.out.println("Não é possível adicionar mais notas.");
        }
    }
    public float calcularMedia() {
        if (quantidadeNotas == 0) return 0;
        float soma = 0;
        for (int i = 0; i < quantidadeNotas; i++) {
            soma += notas[i];
        }
        return soma / quantidadeNotas;
    }
    public void exibirBoletim() {
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.print("Notas: ");
        for (int i = 0; i < quantidadeNotas; i++) {
            System.out.print(notas[i] + " ");
        }
        System.out.println("\nMédia: " + calcularMedia());
    }
    public static void main(String[] args) {
        String nome = "Vinicius Gabriel Buskievicz";
        String matricula = "2023220065";
        int maxNotas = 3;

        Aluno aluno = new Aluno(nome, matricula, maxNotas);

        aluno.adicionarNota(8.5f);
        aluno.adicionarNota(7.0f);
        aluno.adicionarNota(9.0f);

        aluno.exibirBoletim();
    }
}