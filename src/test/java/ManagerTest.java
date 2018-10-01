import Management.Manager;
import Staff.Employee;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before() {
        manager = new Manager("Ricky", "JH901523X", "who knows", 20000);
    }


    @Test
    public void hasName() {
        assertEquals("Ricky", manager.getName());
    }


    @Test
    public void hasDeptName() {
        assertEquals("who knows", manager.getDeptName());
    }
}
