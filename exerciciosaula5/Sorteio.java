package exerciciosaula5;

import java.util.ArrayList;
import java.util.Random;

public class Sorteio {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Vinicius");
        nomes.add("Alisson");
        nomes.add("Nicolas");
        nomes.add("Caio");
        nomes.add("Gabriel");

        Random random = new Random();
        int indice = random.nextInt(nomes.size());
        String nomeSorteado = nomes.get(indice);

        System.out.println("Nome sorteado: " + nomeSorteado);
    }
}
