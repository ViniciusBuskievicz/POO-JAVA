package atividadesaula10.exercicio2;

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
}
