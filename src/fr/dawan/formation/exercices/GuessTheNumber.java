package fr.dawan.formation.exercices;

import java.util.Scanner;

public class GuessTheNumber {
    
    
    

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        
        int number = 50;
        int reponse = -1;
        int temp = 0;
        String choix;
        boolean recommencer = true;
        
        
        do {
            System.out.println("Devinez le nombre auquel je pense:");
            int index = 0;
        do {
            
        //System.out.println("Devinez le nombre auquel je pense:");
        if (index > 0 ) {
           temp = reponse; 
            
        }
        reponse = scan.nextInt();
        scan.nextLine();
        
        if(number > reponse) {
            System.out.println("Le nombre est trop bas");
        }else if(number < reponse) {
            System.out.println("Le nombre est trop haut");
        }else {
            System.out.println("gagné");
        
        }
        
        if(index >0 && reponse > temp && reponse < number) {
            System.out.println("Vous vous rapprochez");
        }else if(index > 0 && reponse < temp && reponse < number)
            System.out.println("Vous vous eloignez");
        else if(index >0 && reponse > temp && reponse > number) {
            System.out.println("Vous vous eloignez");
        }else if(index >0 && reponse < temp && reponse > number)
            System.out.println("Vous vous rapprochez");
        
        index++;
        

        
        }while(reponse!= number);
        System.out.println("Voulez vous recommencez? y:yes, n:no");
        
        choix = scan.nextLine();
        if(choix.equalsIgnoreCase("y") ||choix.equalsIgnoreCase("yes") ) {
            recommencer = true;
        }else {
            recommencer= false;
            System.out.println("A la prochaine!");
        }
        
        }while(recommencer);
       scan.close(); 
        
    }
    
}