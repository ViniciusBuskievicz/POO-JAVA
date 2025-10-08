package atividadesaula10.exercicio2;

import java.util.Scanner;

class IdadeInvalidaException extends Exception {
    public IdadeInvalidaException(String mensagem) {
        super(mensagem);
    }
}

class Usuario {
    private String nome;
    private int idade;

    public Usuario(String nome, int idade) throws IdadeInvalidaException {
        if (idade < 18) {
            throw new IdadeInvalidaException("Idade inválida! Usuário deve ter 18 anos ou mais.");
        }
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}

public class TesteIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();

        try {
            Usuario usuario = new Usuario(nome, idade);
            System.out.println("Usuário cadastrado: " + usuario.getNome() + ", idade: " + usuario.getIdade());
            System.out.println("Idade válida! Cadastro realizado com sucesso.");
        } catch (IdadeInvalidaException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}
