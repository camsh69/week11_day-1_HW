import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PrinterTest {

    Printer printer;

    @Before
    public void before() {
        printer = new Printer(1000, 1500) ;
    }

    @Test
    public void getNumberOfSheetsLeft() {
        assertEquals(1000, printer.getNumberOfSheets());
    }

    @Test
    public void sufficientSheetsLeftToPrint() {
        assertTrue(printer.print(100, 10));
    }

    @Test
    public void insufficientSheetsLeftToPrint() {
        assertFalse(printer.print(100, 11));
    }

    @Test
    public void tonerReducesByOneForEachPage() {
        printer.print(50, 10);
        assertEquals(1000, printer.getTonerValue());
    }
}
