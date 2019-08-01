package factory;

import domain.Gender;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class GenderFactoryTest {

    @Test
    public void getGender() {

        Gender gender = GenderFactory.getGender(1, "M");
        Assert.assertNotNull(gender);

    }
}