package Recepie;

import java.util.HashSet;
import java.util.Set;

public class RecepieList {
    private final Set<Recipie> recipies = new HashSet<>();

    public void addRecepies(Recipie recipie) {
        if (recipies.contains(recipie)) {
            throw new IllegalArgumentException("Такой рецепт уже существует");
        }else {
            recipies.add(recipie);
        }
    }
}
