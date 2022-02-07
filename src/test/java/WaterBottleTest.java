import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle bottle;

    @Before
    public void before() {
        bottle = new WaterBottle();
    }

    @Test
    public void canGetVolume() {
        assertEquals(100, bottle.getVolume());
    }

    @Test
    public void canDrinkFromBottle() {
        bottle.takeDrink();
        bottle.takeDrink();
        assertEquals(80, bottle.getVolume());
    }

    @Test
    public void canEmptyBottle() {
        bottle.emptyBottle();
        assertEquals(0, bottle.getVolume());
    }

    @Test
    public void canFillBottle() {
        bottle.fillBottle();
        assertEquals(100, bottle.getVolume());
    }
}
