package fr.dawan.POO.models;

import fr.dawan.POO.interfaces.EstDomestique;
import fr.dawan.POO.interfaces.Truc;

public class Chien extends Animal implements EstDomestique, Truc{

    public Chien(String name, String color, int age) {
        super(name, color, age);
        // TODO Auto-generated constructor stub
    }

    public Chien() {
        // TODO Auto-generated constructor stub
    }

    public Chien(int nbLegs, int age, String color, String name) {
        super(nbLegs, age, color, name);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void crier() {
        System.out.println("Waf Waf");

    }

    @Override
    public void demanderDesCaresses() {
        System.out.println("Waf waaaaaf");
        
    }

    @Override
    public void jouerALaBalle() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void faitDesTrucs() {
        // TODO Auto-generated method stub
        
    }

}
