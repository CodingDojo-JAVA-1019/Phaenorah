public class Bat extends Mammal {

    public Bat() {
        super(300);
    }
        
    public void fly(){
        this.energyLevel = this.energyLevel -50;
        System.out.println("fly away " + this.energyLevel);
    }
    public void eatHumans(){
        this.energyLevel = this.energyLevel +25;
        System.out.println("Yummy humans yum yum. " + this.energyLevel);
    }
    public void attackTowns(){
        this.energyLevel = this.energyLevel -100;
        System.out.println("Let it burn burn burn. " + this.energyLevel);
    }
}