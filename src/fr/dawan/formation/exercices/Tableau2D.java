package fr.dawan.formation.exercices;

public class Tableau2D {

    private static int [][] classe = {
            {18,11,14,16,14},
            {8,10,11,11,11},
            {2,4,3,17,6}
    };
    
    private static double[] moyennes_classe = new double [classe.length];
    
    public static void moyenneParEleve() {
        
        for (int i = 0; i < classe.length; i++) {
            double somme=0;
            double moyenne=0;
            for (int j = 0; j < classe[i].length; j++) {               
                    somme+=classe[i][j];  
                    
                }
            moyenne=somme/classe[i].length;
            moyennes_classe[i] = moyenne;
            System.out.println("La moyenne est égale à: " + moyenne);
            
            }        
        }
    
    public static void minMaxMoyenne() {
        double min=0;
        double max=0;
        double moyenne;
        for (int i = 0; i < moyennes_classe.length; i++) {
            moyenne = moyennes_classe[i];
            if(i == 0) {
                min = moyenne;
                max= moyenne;
            }
            if(moyenne > max) {
                max = moyenne;
            }
            if(moyenne < min) {
                min = moyenne;
            }
        }
        
        System.out.println("La moyenne min est: " + min);
        System.out.println("La moyenne max est: " + max);
    }
    
    public static void moyenneClasse() {
        double somme=0;
        double moyenne;
        for (int i = 0; i < moyennes_classe.length; i++) {
            
                somme+=moyennes_classe[i];
            
            
        }
        moyenne= somme/moyennes_classe.length;
        System.out.println("La moyenne de la classe est égale à: " + moyenne);
    }
    
    public static void main(String[] args) {
        moyenneParEleve();
        minMaxMoyenne();
        moyenneClasse();

    }

}
