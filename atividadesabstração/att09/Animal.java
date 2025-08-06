package atividadesabstração.att09;
public class Animal {
    String nome;
    String especie;
    int idade;

    public Animal(String nome, String especie, int idade) {
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
    }
    public void fazerBarulho() {
        System.out.println(nome + " (" + especie + ", " + idade + " anos) está fazendo barulho!");
    }
    public static void main(String[] args) {
        Animal cachorro = new Animal("Fred", "Cachorro", 12);
        Animal gato = new Animal("Neguinho", "Gato", 8);

        cachorro.fazerBarulho();
        gato.fazerBarulho();
    }
}