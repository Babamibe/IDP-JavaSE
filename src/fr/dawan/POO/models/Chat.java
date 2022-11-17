package fr.dawan.POO.models;

import fr.dawan.POO.interfaces.EstDomestique;

public final class Chat extends Felin  implements EstDomestique{
    
    public static int count = 0;


    public Chat() {
        count++;
    }

    public Chat(String name, String color, int age) {
        super(name, color, age);
        count++;
    }

    public Chat(int age, String color, String name, boolean sociable, boolean hasGriffesRetractiles) {
        super(age, color, name, sociable, hasGriffesRetractiles);
        count++;
    }
    
        
    public static int getCount() {
        return count;
    }

    @Override
    public void crier() {
        System.out.println("Miaou, miaou");
    }
    
    public void demanderCroquettes() {
        System.out.println("Nourris moi, humaine !");
    }

    @Override
    public void demanderDesCaresses() {
        System.out.println("Occupe toi de moi ou je miaule");
        
    }

    @Override
    public void jouerALaBalle() {
        // TODO Auto-generated method stub
        
    }
    
    

}
