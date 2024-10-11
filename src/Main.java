import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        while (true) {
            calculate();
        }
    }

    private static void calculate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        double a = scanner.nextDouble();
        System.out.println("Please enter a number: ");
        double b = scanner.nextDouble();
        System.out.println("please enter an operation");
        String operation = scanner.next();
        switch (operation) {
            case "+":
                System.out.println(a + b);
                ;
                break;
            case "-":
                System.out.println(a - b);
                ;
                break;
            case "*":
                System.out.println(a * b);
                ;
                break;
            case "/":
                if (b == 0) {
                    System.err.println("Cannot be divided by zero");
                } else {
                    System.out.println(a / b);
                }
                break;
            default:
                System.out.println("Invalid operation");
        }
    }


}