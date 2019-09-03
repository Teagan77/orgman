package ac.za.cput.adp3.xyzcongolmerate.factory.demography;

import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Gender;
import jdk.nashorn.internal.ir.BaseNode;
import org.junit.Test;
import static junit.framework.TestCase.assertNotNull;

public class GenderFactoryTest {

    @Test
    public void buildGender() {
        Gender female = new GenderFactory().buildGender( "This is a female.");
        assertNotNull(female);
        assertNotNull(female.getGenderId());
        System.out.println(female.toString());
    }
}
