import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before() {
        databaseAdmin = new DatabaseAdmin("Tam", "JH666844XV", 17000);
    }

    @Test
    public void hasName() {
        assertEquals("Tam", databaseAdmin.getName());
    }

    @Test
    public void hasNINumber() {
        assertEquals("JH666844XV", databaseAdmin.getNiNumber());
    }


    @Test
    public void hasSalary() {
        assertEquals(17000, databaseAdmin.getSalary(), 0.1);
    }

    @Test
    public void canChangeName() {
        databaseAdmin.changeName("Davie");
        assertEquals("Davie", databaseAdmin.getName());
    }


}
