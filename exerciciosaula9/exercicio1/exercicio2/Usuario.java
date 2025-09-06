package exerciciosaula9.exercicio1.exercicio2;

public class Usuario implements Autenticavel{
    private String senha;

    public Usuario(String senha){
        this.senha = senha;
    }
    @Override
    public boolean Autenticar(String senha){
        if (this.senha.equals(senha)) {
            return true;
        }
        return false;
    }

}