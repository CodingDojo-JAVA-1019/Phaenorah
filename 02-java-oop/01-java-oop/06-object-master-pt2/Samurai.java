public class Samurai extends Human {

    public Samurai() {
        super();
        this.health = 200;
        this.intelligence = 8; 
    }
    public void deathBlow(){
        this.energyLevel = this.energyLevel -50;
        System.out.println("fly away " + this.energyLevel);
    }
    public void meditate(){
        this.energyLevel = this.energyLevel -50;
        System.out.println("fly away " + this.energyLevel);
    }
    public void howMany(){
        this.energyLevel = this.energyLevel -50;
        System.out.println("fly away " + this.energyLevel);
    }


}