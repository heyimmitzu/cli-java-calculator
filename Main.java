import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private Double memory = null;
    private boolean isMemory = false;
    private double x = 0;
    private double y = 0;
    private double total = 0;
    private ArrayList<CalculationRecord> calculationRecord = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void main() {
        boolean running = true;
        System.out.println("-----------------------------");
        System.out.println("Calculator made by heyimmitzu");
        System.out.println("-----------------------------");
        while (running) {
            operationMenu();
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
                    clearMemory();
                    break;
                case 6:
                    renderCalculationHistory();
                    break;
                case 7:
                    running = quitApp();
                    break;
            }
        }
    }

    private void renderCalculationHistory() {
        System.out.println("-----------------------------");
        System.out.println("Calculation History: ");
        for (CalculationRecord record : calculationRecord)
            record.printOperation();
        System.out.println("-----------------------------");
    }

    private boolean quitApp() {
        System.out.println("Bye, have a splendid day");
        return false;
    }

    private void clearMemory() {
        memory = null;
        isMemory = false;
        System.out.println("Memory has been cleared!");
        System.out.println("-----------------------------");
    }

    private void operationMenu() {
        System.out.println("Chose an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Clear memory value");
        System.out.println("6. Show calculation history");
        System.out.println("7. Quit application");
        if (isMemory) System.out.println("Memory value: " + memory);
        System.out.println("-----------------------------");
    }

    private double getInputWithMemory(String prompt) {
        if (isMemory && memory != null) {
            System.out.println(prompt);
            System.out.println(
                "Use memory value (" + memory + ") for " + prompt + "? (y/n)"
            );
            if (scanner.next().equalsIgnoreCase("y")) return memory;
        }
        System.out.println(prompt);
        return scanner.nextDouble();
    }

    private void performAddition() {
        System.out.println("X + Y = ");
        x = getInputWithMemory("Chose X: ");
        y = getInputWithMemory("Chose Y: ");
        total = x + y;
        memory = total;
        isMemory = true;
        calculationRecord.add(new CalculationRecord("+", x, y, total));
        System.out.println(x + " + " + y + " = " + total);
        System.out.println("-----------------------------");
    }

    private void performSubtraction() {
        System.out.println("X - Y = ");
        x = getInputWithMemory("Chose X: ");
        y = getInputWithMemory("Chose Y: ");
        total = x - y;
        memory = total;
        isMemory = true;
        calculationRecord.add(new CalculationRecord("-", x, y, total));
        System.out.println(x + " - " + y + " = " + total);
        System.out.println("-----------------------------");
    }

    private void performMultiplication() {
        System.out.println("X * Y = ");
        x = getInputWithMemory("Chose X: ");
        y = getInputWithMemory("Chose Y: ");
        total = x * y;
        memory = total;
        isMemory = true;
        calculationRecord.add(new CalculationRecord("*", x, y, total));
        System.out.println(x + " * " + y + " = " + total);
        System.out.println("-----------------------------");
    }

    private void performDivision() {
        System.out.println("X / Y = ");
        x = getInputWithMemory("Chose X: ");
        y = getInputWithMemory("Chose Y: ");
        total = x / y;
        memory = total;
        isMemory = true;
        calculationRecord.add(new CalculationRecord("/", x, y, total));
        System.out.println(x + " / " + y + " = " + total);
        System.out.println("-----------------------------");
    }
}
