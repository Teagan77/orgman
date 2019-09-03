package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.UserRole;
import org.junit.Test;

import static junit.framework.TestCase.assertNotNull;
import static org.junit.Assert.*;

public class UserRoleFactoryTest {

    @Test
    public void buildUserRole() {
        UserRole userRole1 = new UserRole( "OF868dfdba-9ff8-4b76-81b8-456985245698", "teaganrandall7@mycput.ac.za"
                , "RF868dfdba-9ff8-4b76-81b8-611238100162");
        assertNotNull(userRole1.getRoleId());
        assertNotNull(userRole1);
        System.out.println(userRole1.toString());
    }
}
