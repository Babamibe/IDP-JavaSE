package fr.dawan.POO;

import java.util.ArrayList;
import java.util.List;

import fr.dawan.POO.interfaces.EstDomestique;
import fr.dawan.POO.models.Animal;
//import fr.dawan.POO.models.Animal;
import fr.dawan.POO.models.Chat;
import fr.dawan.POO.models.Chien;
import fr.dawan.POO.models.Felin;

public class Main {

    public static void main(String[] args) {


        Chien chien = new Chien();
        chien.setName("Medor");
        
        Chat chat = new Chat("Cactus", "tabby", 10);
        System.out.println(chat.getName());
        chat.manger();
        chat.crier();
        chien.crier();
        
        Felin felin = new Felin("John-john", "roux", 103);
        felin.crier();
        chien.demanderDesCaresses();
        chat.demanderCroquettes();
        System.out.println(Animal.getCount());
        System.out.println(Chat.getCount());
        
        //Polymorphisme
        Animal cat1 = new Chat();
        Animal felin1 = new Felin();
        System.out.println(cat1.getPelage()); //Fourrure
        System.out.println(felin1.getPelage()); //Fourrure
        cat1.crier(); //Miaou
        
        /*
         * Pas d'accès aux attributs et méthodes qui ne viennent pas de la classe Animal
         */
        
        List<Animal> mes_animaux = new ArrayList<>();
        mes_animaux.add(felin1);
        mes_animaux.add(cat1);
        mes_animaux.add(chien); // chien contenu dans la liste sera casté en Animal
        
        EstDomestique chien2 = new Chien();
        EstDomestique chat2 = new Chat();
        chien2.demanderDesCaresses();
        chat2.jouerALaBalle();
        
        //Chien chien= new Chien();
        System.out.println("Chien est un animal? " + (chien instanceof Animal));
        System.out.println("Chien est un chien? " + (chien instanceof Chien));
        System.out.println("Chien est domestique? " + (chien instanceof EstDomestique));
        
        //EstDomestique chien2 = new Chien();
        System.out.println("Chien2 est un animal? " + (chien instanceof Animal));
        System.out.println("Chien2 est un chien? " + (chien instanceof Chien));
        System.out.println("Chien2 est domestique? " + (chien instanceof EstDomestique));
        
         
    }

}
