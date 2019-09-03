package ac.za.cput.adp3.xyzcongolmerate.factory.org;

import ac.za.cput.adp3.xyzcongolmerate.domain.org.Organisation;
import org.junit.Test;

import static junit.framework.TestCase.assertNotNull;
import static org.junit.Assert.*;

public class OrganisationFactoryTest {

    @Test
    public void buildOrganisation() {
        Organisation csg = new OrganisationFactory().buildOrganisation( "CSG International");
        assertNotNull(csg);
        assertNotNull(csg.getOrgCode());
        System.out.println(csg.toString());
    }
}
