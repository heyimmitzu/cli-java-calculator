import java.util.Scanner;

public class Main {

    private double memory = 0;
    private boolean isMemory = false;
    private double x = 0;
    private double y = 0;
    Scanner scanner = new Scanner(System.in);

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
            System.out.println("5. Clear memory value");
            System.out.println("6. Quit application");
            if (isMemory) System.out.println("Memory value: " + memory);
            System.out.println("-----------------------------");
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
                    memory = 0;
                    break;
                case 6:
                    running = false;
                    break;
            }
        }
    }

    private void performAddition() {
        System.out.println("X + Y = ");
        System.out.println("Chose X: ");
        if (isMemory) {
            System.out.println("Use memory value for X? (y/n)");
            String memoryX = scanner.next();
            if (memoryX.equals("y")) x = memory;
            else {
                System.out.println("Enter X: ");
                x = scanner.nextDouble();
            }
        } else x = scanner.nextDouble();
        System.out.println("Chose Y: ");
        if (isMemory) {
            System.out.println("Use memory value for Y? (y/n)");
            String memoryY = scanner.next();
            if (memoryY.equals("y")) y = memory;
            else {
                System.out.println("Enter Y: ");
                y = scanner.nextDouble();
            }
        } else y = scanner.nextDouble();
        double total = x + y;
        memory = total;
        isMemory = true;
        System.out.println(x + " + " + y + " = " + total);
        System.out.println("-----------------------------");
    }

    private void performSubtraction() {
        System.out.println("X - Y = ");
        System.out.println("Chose X: ");
        double x = scanner.nextDouble();
        System.out.println("Chose Y: ");
        double y = scanner.nextDouble();
        double total = x - y;
        memory = total;
        isMemory = true;
        System.out.println(x + " - " + y + " = " + total);
        System.out.println("-----------------------------");
    }

    private void performMultiplication() {
        System.out.println("X * Y = ");
        System.out.println("Chose X: ");
        double x = scanner.nextDouble();
        System.out.println("Chose Y: ");
        double y = scanner.nextDouble();
        double total = x * y;
        memory = total;
        isMemory = true;
        System.out.println(x + " * " + y + " = " + total);
        System.out.println("-----------------------------");
    }

    private void performDivision() {
        System.out.println("X / Y = ");
        System.out.println("Chose X: ");
        double x = scanner.nextDouble();
        System.out.println("Chose Y: ");
        double y = scanner.nextDouble();
        double total = x / y;
        memory = total;
        isMemory = true;
        System.out.println(x + " / " + y + " = " + total);
        System.out.println("-----------------------------");
    }
}
