package LAB2.flyweight;

public class MultiplicationOperation implements Flyweight {
    @Override
    public double execute(double a, double b) {
        return a * b;
    }
}
