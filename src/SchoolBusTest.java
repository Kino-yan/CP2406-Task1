import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SchoolBusTest {
    Road road = new Road("0", 1, 5, new int[]{0, 0});
    SchoolBus schoolbus = new SchoolBus("0");

    @Test
    void getLength() {
        assertEquals(3, schoolbus.getLength());
    }

    @Test
    void getId() {
        assertEquals("SchoolBus_0", schoolbus.getId());
    }

    @Test
    void testInheritance() {
        assertEquals(0, schoolbus.getSpeed());
        assertEquals(1, schoolbus.getPosition());
    }
}
