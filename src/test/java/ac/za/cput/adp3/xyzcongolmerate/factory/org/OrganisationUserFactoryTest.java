package ac.za.cput.adp3.xyzcongolmerate.factory.org;

import ac.za.cput.adp3.xyzcongolmerate.domain.org.OrganisationUser;
import org.junit.Test;

import java.util.UUID;

import static ac.za.cput.adp3.xyzcongolmerate.util.Helper.getSuffixFromClassName;
import static junit.framework.TestCase.assertNotNull;
import static org.junit.Assert.*;

public class OrganisationUserFactoryTest {

    private static final String SUFFIX = getSuffixFromClassName(OrganisationUserFactory.class);

    @Test
    public void buildOrganisationUser() {
        OrganisationUser orgUser1 = new OrganisationUser(SUFFIX + UUID.randomUUID().toString(), "teaganrandall7@mycput.ac.za");
        assertNotNull(orgUser1);
        assertNotNull(orgUser1.getUserEmail());
        System.out.println(orgUser1.toString());
    }
}
