package LAB03.flyweight;

public class AdditionOperation implements Flyweight {
    @Override
    public double execute(double a, double b) {
        return a + b;
    }
}
