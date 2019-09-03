package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.User;
import org.junit.Test;

import static junit.framework.TestCase.assertNotNull;
import static org.junit.Assert.*;

public class UserFactoryTest {

    @Test
    public void buildUser() {
        User user1 = new UserFactory().buildUser( "teaganrandall7@gmail.com", "Teagan", "Randall");
        assertNotNull(user1);
        assertNotNull(user1.getUserEmail());
        System.out.println(user1.toString());
    }
}
