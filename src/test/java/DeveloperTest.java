import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before() {
        developer = new Developer("Jim", "JH6668909E", 15000);
    }

    @Test
    public void hasName() {
        assertEquals("Jim", developer.getName());
    }

    @Test
    public void hasNINumber() {
        assertEquals("JH6668909E", developer.getNiNumber());
    }


    @Test
    public void hasSalary() {
        assertEquals(15000, developer.getSalary(), 0.1);
    }

    @Test
    public void canChangeName() {
        developer.changeName("Wullie");
        assertEquals("Wullie", developer.getName());
    }


}
