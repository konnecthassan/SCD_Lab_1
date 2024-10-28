#SCD_Lab_1
public class CalculatorMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int sum = calculator.add(10, 20);
        int product = calculator.multiply(10, 20);
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
    }
}
