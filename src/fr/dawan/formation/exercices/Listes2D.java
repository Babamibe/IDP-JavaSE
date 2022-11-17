package fr.dawan.formation.exercices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Listes2D {
    
//    public static double moyenneParEleve(List<Integer> moyenneEleve) {
//        for (int i = 0; i < moyenneEleve.size(); i++) {
//            
//        }
//    }

    public static void main(String[] args) {
        
        List<List<Integer>> classe = new ArrayList<>(
                Arrays.asList(
                        new ArrayList<>(Arrays.asList(18,11,14,16,14)),
                        new ArrayList<>(Arrays.asList(8,10,11,11,11)),
                        new ArrayList<>(Arrays.asList(2,4,3,17,6))
                        ));
        
        
        System.out.println(classe);
    }

}
