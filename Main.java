import java.util.Scanner;

public class Main {

    public void main() {
        boolean running = true;
        System.out.println("Calculator made by heyimmitzu");
        System.out.println("-----------------------------");
        while (running) {
            System.out.println("Chose an operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Quit application");
            System.out.println("-----------------------------");
            Scanner scanner = new Scanner(System.in);
            int operation = scanner.nextInt();
            switch (operation) {
                case 1:
                    performAddition();
                    break;
                case 2:
                    performSubtraction();
                    break;
                case 3:
                    performMultiplication();
                    break;
                case 4:
                    performDivision();
                    break;
                case 5:
                    running = false;
                    break;
            }
        }
    }

    private void performAddition() {
        System.out.println("X + Y = ");
        System.out.println("Chose X: ");
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        System.out.println("Chose Y: ");
        double y = scanner.nextDouble();
        double sum = x + y;
        System.out.println(x + " + " + y + " = " + sum);
        System.out.println("-----------------------------");
    }

    private void performSubtraction() {
        System.out.println("X - Y = ");
        System.out.println("Chose X: ");
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        System.out.println("Chose Y: ");
        double y = scanner.nextDouble();
        double sum = x - y;
        System.out.println(x + " - " + y + " = " + sum);
        System.out.println("-----------------------------");
    }

    private void performMultiplication() {
        System.out.println("X * Y = ");
        System.out.println("Chose X: ");
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        System.out.println("Chose Y: ");
        double y = scanner.nextDouble();
        double sum = x * y;
        System.out.println(x + " * " + y + " = " + sum);
        System.out.println("-----------------------------");
    }

    private void performDivision() {
        System.out.println("X / Y = ");
        System.out.println("Chose X: ");
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        System.out.println("Chose Y: ");
        double y = scanner.nextDouble();
        double sum = x / y;
        System.out.println(x + " / " + y + " = " + sum);
        System.out.println("-----------------------------");
    }
}
