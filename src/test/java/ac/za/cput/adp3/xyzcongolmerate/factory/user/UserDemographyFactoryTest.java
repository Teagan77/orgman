package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.UserDemography;
import org.junit.Test;

import java.util.Date;
import java.util.UUID;

import static junit.framework.TestCase.assertNotNull;
import static org.junit.Assert.*;

public class UserDemographyFactoryTest {

    @Test
    public void buildUserDemography() {
        UserDemography userDemog1 = new UserDemography( "teaganrandall7@mycput.ac.za", "Mr."
                , "GF868dfdba-9ff8-4b76-81b8-611238100162", "RF67b75750-b101-4a86-95ba-a0733af1426c"
                , new Date());
        assertNotNull(userDemog1);
        assertNotNull(userDemog1.getUserEmail());
        System.out.println(userDemog1.toString());
    }
}
