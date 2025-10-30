public class CalculationRecord {

    String operationType;
    double x, y, total;

    public CalculationRecord(
        String operationType,
        double x,
        double y,
        double total
    ) {
        this.operationType = operationType;
        this.x = x;
        this.y = y;
        this.total = total;
    }

    public void printOperation() {
        System.out.println(
            this.x + " " + operationType + " " + this.y + " = " + this.total
        );
    }
}
