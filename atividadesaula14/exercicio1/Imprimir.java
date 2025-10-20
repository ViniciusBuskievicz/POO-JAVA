package atividadesaula14.exercicio1;

import java.util.List;
import java.util.ArrayList;

public class Imprimir {

    public static void imprimirLista(List<?> lista) {
        for (Object item : lista) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);

        List<String> nomes = new ArrayList<>();
        nomes.add("Ana");
        nomes.add("Bruno");
        nomes.add("Carla");

        List<Double> valores = new ArrayList<>();
        valores.add(1.5);
        valores.add(2.75);
        valores.add(3.0);

        System.out.println("Integers:");
        imprimirLista(numeros);

        System.out.println("\nStrings:");
        imprimirLista(nomes);

        System.out.println("\nDoubles:");
        imprimirLista(valores);
    }
}
