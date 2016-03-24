package za.ac.mkums.cput;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.mkums.cput.domain.StdInfo_Encapsulation;

/**
 * Created by Songezo on 2016-03-14.
 */
public class TestEncapsulation {

    private StdInfo_Encapsulation stdInfo;

    @Before
    public void setUp() throws Exception {
        stdInfo = new StdInfo_Encapsulation();

    }

    @Test
    public void testEncapsulation() throws Exception {
        stdInfo.setStdNumber("213054299");
        stdInfo.setSurname("Mkumatela");
        stdInfo.setYearOfStudy("3rd Year");

        Assert.assertSame("213054299", stdInfo.getStdNumber());
        Assert.assertSame("Mkumatela", stdInfo.getSurname());
        Assert.assertSame("3rd Year", stdInfo.getYearOfStudy());

        System.out.print("The Std Details are: " + stdInfo.getStdNumber() + ", " + stdInfo.getSurname() + ", " + stdInfo.getYearOfStudy());
    }

    @After
    public void tearDown() throws Exception {

    }
}
