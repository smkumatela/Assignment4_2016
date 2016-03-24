package za.ac.mkums.cput;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.mkums.cput.domain.inheritence.Food;
import za.ac.mkums.cput.domain.inheritence.Pasta;
import za.ac.mkums.cput.domain.inheritence.Rice;

/**
 * Created by Songezo on 2016-03-13.
 */
public class TestInheritence {

    private Food food;
    private Pasta pasta;
    private Rice rice;

    @Before
    public void setUp() throws Exception {
        food = new Food();
        pasta = new Pasta();
        rice = new Rice();
    }

    @Test
    public void testInheritence() throws Exception {
        Assert.assertSame(pasta.eat(), food.eat());
        Assert.assertSame(rice.eat(), food.eat());
        Assert.assertEquals(pasta.eat(), rice.eat());
    }

    @After
    public void tearDown() throws Exception {

    }
}
