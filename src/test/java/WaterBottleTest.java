import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterBottle;

    @Before
    public void before() {
        waterBottle = new WaterBottle(100);
    }

    @Test
    public void willTakeADrinkIfGreaterThan10Full() {
        assertEquals(true, waterBottle.takeDrink());
    }

    @Test
    public void willNotTakeADrinkIfLessThan10(){
        waterBottle = new WaterBottle(8);
        assertEquals(false, waterBottle.takeDrink());
    }

    @Test
    public void willTakeADrink() {
        assertEquals(90, waterBottle.takeDrinkV2());
    }

    @Test
    public void hasEmptyBottle(){
        assertEquals(0, waterBottle.emptyBottle());
    }

    @Test
    public void hasMakeBottleFull(){
        assertEquals(100, waterBottle.makeBottleFull());
    }

}

