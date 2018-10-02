import Management.Manager;
import Staff.Employee;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before() {
        manager = new Manager("Ricky", "JH97771523X", "who knows", 20000);
    }


    @Test
    public void hasName() {
        assertEquals("Ricky", manager.getName());
    }

    @Test
    public void hasNINumber() {
        assertEquals("JH97771523X", manager.getNiNumber());
    }


    @Test
    public void hasSalary() {
        assertEquals(20000, manager.getSalary(), 0.1);
    }
    

    @Test
    public void hasDeptName() {
        assertEquals("who knows", manager.getDeptName());
    }

    @Test
    public void canChangeName() {
        manager.changeName("New Boss");
        assertEquals("New Boss", manager.getName());
    }
}
