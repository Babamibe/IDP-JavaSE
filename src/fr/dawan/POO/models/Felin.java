package fr.dawan.POO.models;

import fr.dawan.POO.enums.Pelage;

public class Felin  extends Animal{

    private boolean sociable;
    private boolean hasGriffesRetractiles;
    
    public Felin() {
        super();
        this.setPelage(Pelage.FOURRURE);
    }




    public Felin( String name, String color, int age) {
        super(4, age, color, name);
        this.setPelage(Pelage.FOURRURE);
    }




    public Felin( int age, String color, String name, boolean sociable, boolean hasGriffesRetractiles) {
        super(4, age, color, name);
        this.sociable = sociable;
        this.hasGriffesRetractiles = hasGriffesRetractiles;
        this.setPelage(Pelage.FOURRURE);
    }


    


    public boolean isSociable() {
        return sociable;
    }




    public void setSociable(boolean sociable) {
        this.sociable = sociable;
    }




    public boolean isHasGriffesRetractiles() {
        return hasGriffesRetractiles;
    }




    public void setHasGriffesRetractiles(boolean hasGriffesRetractiles) {
        this.hasGriffesRetractiles = hasGriffesRetractiles;
    }




    @Override
    public void crier() {
        System.out.println("Graou Graou");
        
    }




    
    
    
    
}
