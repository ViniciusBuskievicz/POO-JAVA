package atividadesaula14.exercicio2;

import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class Estados {

    public static void adicionarCidade(Map<String, List<String>> mapa, String estado, String cidade) {
        mapa.computeIfAbsent(estado, k -> new ArrayList<>()).add(cidade);
    }

    public static List<String> cidadesDoEstado(Map<String, List<String>> mapa, String estado) {
        return mapa.getOrDefault(estado, new ArrayList<>());
    }

    public static void imprimirTodas(Map<String, List<String>> mapa) {
        for (Map.Entry<String, List<String>> entrada : mapa.entrySet()) {
            String estado = entrada.getKey();
            List<String> cidades = entrada.getValue();
            System.out.println("----------------------------");
            System.out.println(estado + ":");
            for (String cidade : cidades) {
                System.out.println(cidade);
            }
            System.out.println("----------------------------");
        }
    }

    public static void main(String[] args) {
        Map<String, List<String>> mapa = new HashMap<>();
        
        adicionarCidade(mapa, "PR", "Curitiba");
        adicionarCidade(mapa, "PR", "Londrina");
        adicionarCidade(mapa, "PR", "Maringá");
        adicionarCidade(mapa, "PR", "Cascavel");
        adicionarCidade(mapa, "PR", "Ponta Grossa");
        System.out.println("----------------------------");
        System.out.println("Cidades do Paraná (PR):");
        System.out.println("----------------------------");
        for (String cidade : cidadesDoEstado(mapa, "PR")) {
            System.out.println(cidade);
        }
        System.out.println("----------------------------"); 
        System.out.println("Todas as cidades por estado:");
        imprimirTodas(mapa);
    }
}
