package atividadesaula8.exercicio1;

import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args){
        Animal[] animais = {new Cachorro(),new Gato()};
        for (Animal animal : animais){
            animal.emitirSom();
        }

    }
}