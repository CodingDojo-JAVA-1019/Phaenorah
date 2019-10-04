public class Gorilla extends Mammal {
    
    public void throwSomething(){
        this.energyLevel = this.energyLevel -5;
        System.out.println("oops I threw my banana " + this.energyLevel);
    }
    public void eatBananas(){
        this.energyLevel = this.energyLevel +10;
        System.out.println("I love eating bananas. " + this.energyLevel);
    }
    public void climb(){
        this.energyLevel = this.energyLevel -10;
        System.out.println("When I climb trees, I get so tired. " + this.energyLevel);
    }
}