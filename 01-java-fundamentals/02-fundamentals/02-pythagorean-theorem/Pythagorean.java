public class Pythagorean {
    public double calculateHypotenuse(int legA, int legB) {
        double a = legA * legA;
        double b = legB * legB;
        double c = Math.sqrt(a + b);
        return c;
    }
}