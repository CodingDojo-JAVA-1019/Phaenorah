public class Test {
	public static void main(String[] args) {
		Human ninja1 = new Human();
		Human ninja2 = new Human();
		
		ninja1.attack(ninja2);
		System.out.println(ninja2.health);
	}

}