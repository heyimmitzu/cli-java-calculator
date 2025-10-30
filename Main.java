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
            int operation = getValidMenuInput();
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
                case 7:
                    clearMemory();
                    break;
                case 8:
                    renderCalculationHistory();
                    break;
                case 5:
                    performPower();
                    break;
                case 6:
                    performRoot();
                    break;
                case 9:
                    running = quitApp();
                    break;
            }
        }
    }

    private double getValidNumberInput() {
        while (true) {
            if (scanner.hasNextDouble()) {
                return scanner.nextDouble();
            } else {
                scanner.next();
                System.out.println("Please enter a valid number!");
            }
        }
    }

    private int getValidMenuInput() {
        while (true) {
            if (scanner.hasNextInt()) {
                int input = scanner.nextInt();
                if (input >= 1 && input <= 9) return input;
            }
            System.out.println("Please enter a valid number between 1 and 9!");
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
        System.out.println("Bye, have a splendid day!");
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
        System.out.println("5. Calculate Power");
        System.out.println("6. Calculate Root");
        System.out.println("7. Clear memory value");
        System.out.println("8. Show calculation history");
        System.out.println("9. Quit application");
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
        return getValidNumberInput();
    }

    private void performPower() {
        System.out.println("X ^ Y = ");
        x = getInputWithMemory("Chose X: ");
        y = getInputWithMemory("Chose Y: ");
        total = Math.pow(x, y);
        memory = total;
        isMemory = true;
        calculationRecord.add(new CalculationRecord("+", x, y, total));
        System.out.println(x + " ^ " + y + " = " + total);
        System.out.println("-----------------------------");
    }

    private void performRoot() {
        System.out.println("X ^ (1/Y) = ");
        x = getInputWithMemory("Chose X: ");
        y = getInputWithMemory("Chose Y: ");
        total = Math.pow(x, (1 / y));
        memory = total;
        isMemory = true;
        calculationRecord.add(new CalculationRecord("+", x, y, total));
        System.out.println(x + " ^ " + "(1/" + y + ") = " + total);
        System.out.println("-----------------------------");
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
