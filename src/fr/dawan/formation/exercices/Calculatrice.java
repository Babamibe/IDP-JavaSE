package fr.dawan.formation.exercices;

import java.util.Scanner;

public class Calculatrice {

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       
       double a;
       double b;
       double operation;
       String reponse;
       char continuer;
       boolean fonctionne = true;
       
       do {
       System.out.println("Entrez le premier chiffre");
       a = scan.nextDouble();
       System.out.println("Entrez le deuxième chiffre");
       b = scan.nextDouble();
       scan.nextLine();
           
       System.out.println("Quelle opération souhaitez vous faire? addition: + ;  soustraction: - ; multiplication: * ; division: / ");
       
       reponse = scan.nextLine();
       switch(reponse) {
       case "+":
           operation = a + b;
           System.out.println("Le résultat de l'addition est: " + operation );
           break;
       case "-":
           operation = a-b;
           System.out.println("Le résultat de la soustraction est: " + operation );
           break;
       case "*":
           operation= a*b;
           System.out.println("Le résultat de la multiplication est: " + operation );
           break;
       case "/": 
           operation = a/b;
           System.out.println("Le résultat de la division est: " + operation );
           break;
           default:
               System.out.println("Erreur, cette opération n'est pas valable");
       }
       
       System.out.println("Voulez-vous continuer? y: yes, n:no");
       continuer = scan.next().charAt(0);
       if(continuer == 'n') {
           fonctionne = false;
           System.out.println("Fin des opérations");
       }
       
       }while(fonctionne);
       
       scan.close();

    }
    

}
