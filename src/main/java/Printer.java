public class Printer {

    private int numberOfSheets;
    private int tonerValue;

    public Printer(int numberOfSheets, int tonerValue) {
        this.numberOfSheets = numberOfSheets;
        this.tonerValue = tonerValue;
    }

    public int getNumberOfSheets() {
        return this.numberOfSheets;
    }

    public boolean print(int pages, int copies) {
        int totalSheetsRequired = pages * copies;
        if (totalSheetsRequired <= this.numberOfSheets) {
           this.numberOfSheets -= totalSheetsRequired;
           this.tonerValue -= totalSheetsRequired;
           return true;
        }
        return false;
    }

    public int getTonerValue() {
        return this.tonerValue;
    }
}
