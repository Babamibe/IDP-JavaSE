package fr.dawan.formation.exercices;
import java.util.Arrays;

public class Tableaux {
    
    public static double[] tab = {20,-9,12,17,2,11};
    
    public static double moyenne() {
        double somme=0;
        double moyenne;
        int nbrNotes=0;
        for (int i = 0; i < tab.length; i++) {
            if(tab[i] <= 20 && tab[i] >=0) {
                somme+=tab[i];
                nbrNotes++;
            }
            
        }
        moyenne= somme/nbrNotes;
        System.out.println("La moyenne est égale à: " + moyenne);
        return moyenne;
    }
    
    public static double mediane() {
        Arrays.sort(tab);
          int index= tab.length/2;
          double mediane=0;
          if(tab.length%2 ==1) {
              mediane =tab[index];
              System.out.println("La note médiane est: " + mediane);
              return mediane ;
          }else {
              mediane =(tab[index-1]+tab[index])/2;
              System.out.println("La note médiane est: " + mediane);
          return mediane;
          }
    }

    public static void main(String[] args) {
        moyenne();
        mediane();

    }

}
