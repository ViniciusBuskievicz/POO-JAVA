package atividadesabstração.att06;
public class Curso {
    String nome;
    String codigo;
    int cargaHoraria;

    public Curso(String nome, String codigo, int cargaHoraria) {
        this.nome = nome;
        this.codigo = codigo;
        this.cargaHoraria = cargaHoraria;
    }
    public void exibirDados() {
        System.out.println("Nome do curso: " + nome);
        System.out.println("Código: " + codigo);
        System.out.println("Carga horária: " + cargaHoraria + " horas");
    }
    public static void main(String[] args) {
        Curso curso = new Curso("Programação Orientada a Objetos", "6iivgno2", 60);
        curso.exibirDados();
    }
}