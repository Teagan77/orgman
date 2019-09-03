package ac.za.cput.adp3.xyzcongolmerate.factory.misc;

import ac.za.cput.adp3.xyzcongolmerate.domain.misc.Role;
import org.junit.Test;

import static junit.framework.TestCase.assertNotNull;
import static org.junit.Assert.*;

public class RoleFactoryTest {

    @Test
    public void buildRole() {
        Role manager = new RoleFactory().buildRole( "Management.");
        assertNotNull(manager);
        assertNotNull(manager.getRoleId());
        System.out.println(manager.toString());
    }
}
