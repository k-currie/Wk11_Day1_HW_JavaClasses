import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(50);
    }

    @Test
    public void willPrintIfSheetsLeftIsGreaterThanPrintJob(){
        assertEquals(10, printer.print(10,4));
    }

    @Test
    public void willNotPrintIfSheetsLeftIsGreaterThanPrintJob(){
        assertEquals(0, printer.print(20,3));
    }

}
