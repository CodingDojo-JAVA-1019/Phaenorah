public class Samurai extends Human {

    public Samurai() {
        super();
        this.health = 200;
        this.intelligence = 8; 
        noOfSamurai++;
    }
    public void deathBlow(Human h){
        h.health = h.health - 100;
        this.health = this.health - 100;
        System.out.println("fly away " + this.health);
        System.out.println("You are dead!!" + h.health);
    }
    public void meditate(){
        this.health = this.health * 0.5;
        System.out.println("You are healed " + this.health);
    }
    public void howMany(){
        noOfSamurai++;
        System.out.println("fly away " + this.health);
    }


}