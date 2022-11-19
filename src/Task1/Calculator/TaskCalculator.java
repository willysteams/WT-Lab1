package Task1.Calculator;

public class TaskCalculator {
    public double Calculate(double x, double y) {
        double result = Math.sin(x + y);
        result *= result;
        result++;
        double denom = (2 * x) / (1 + x * x + y * y);
        denom = x - denom;
        denom = 2 + Math.abs(denom);
        result /= denom;
        return result + x;
    }
}
