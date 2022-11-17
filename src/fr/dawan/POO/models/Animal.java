package fr.dawan.POO.models;

import fr.dawan.POO.enums.Pelage;

abstract public class Animal {
    
    //POJO - Plain Old Java Object --> Classe sans restriction
    // Java Beans --> classe qui contient un constructeur, attributs en privé, getters/ setters, toString, serializable
    // Bonne pratique, convention d'écriture
    
    /*
     * Public --> utilisable dans tout le projet
     * Private --> utilisable uniquement dans la classe
     * Protected (default) --> utilisable uniquement dans le package
     */
    
    
    private int nbLegs, age;
    private String color, name;
    private Pelage pelage;
    public static int count = 0;
    
    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
        count++;
    }

    public Animal() {
       count++;
    }
    
    
    
    public Animal(int nbLegs, int age, String color, String name) {
        this.nbLegs = nbLegs;
        this.age = age;
        this.color = color;
        this.name = name;
        count++;
    }

    public void switchPelage() {
        
        switch (this.pelage) {
        case FOURRURE:
            System.out.println("Perd ses poils partout");
            break;
        case ECAILLES:
            System.out.println("Pas agréable à caresser");
            break;
        case CARAPACES:
            System.out.println("Ne change pas régulièrement");
            break;

        default:
            System.out.println("Autre");
            break;
        }
    }
    public int getNbLegs() {
        return nbLegs;
    }

    public void setNbLegs(int nbLegs) {
        this.nbLegs = nbLegs;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    
    public Pelage getPelage() {
        return pelage;
    }

    public void setPelage(Pelage pelage) {
        this.pelage = pelage;
    }

    public static int getCount() {
        return count;
    }

    public void manger() {
        System.out.println(this.name + " dit Miam Miam");
    }
    
    public abstract void crier();

}
