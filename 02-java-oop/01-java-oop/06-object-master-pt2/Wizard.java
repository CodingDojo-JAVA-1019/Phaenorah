public class Wizard extends Human {

    public Wizard() {
        super();
        this.health = 50;
        this.intelligence = 8; 
    }
    public void heal(Human h){
        h.health = h.health + this.intelligence;
        System.out.println("You are healed!!! " + this.health);
    }
    public void fireBall(Human h){
        h.health = h.health - (3 * this.intelligence);
        System.out.println("fire fire!!! " + this.health);
    }

}