public class Human{
    protected int health;
    protected int strength;
    protected int intelligence;
    protected int stealth;

    public Human() {
        this.health = 100; 
        this.strength = 3;  
        this.intelligence = 3;  
        this.stealth = 3;        
    }
    public Human(int level) {
        this.health = level;
    }
    public int displayEnergy(){
        System.out.println("My health level is: " + this.health);
        return this.health;
    }
    public void attackHuman() {
        this.health = this.health - this.strength;
        System.out.println("Attacked!!!! Ouch that hurt!!: " + this.health);
    }
}