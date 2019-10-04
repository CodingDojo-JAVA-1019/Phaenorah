public class Ninja extends Human {

    public Ninja() {
        super();
        this.stealth = 10;        
    }
    public void stealHuman(){
        this.health = this.health - this.stealth;
        System.out.println("Hey you sneaky ninja " + this.health);
    }
    public void runAway(){
        this.health = this.health -10;
        System.out.println("run away " + this.health);
    }
    
}