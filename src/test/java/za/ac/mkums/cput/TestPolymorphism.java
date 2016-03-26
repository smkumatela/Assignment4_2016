package za.ac.mkums.cput;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.mkums.cput.domain.polymorphism.BasketBall;
import za.ac.mkums.cput.domain.polymorphism.Soccer;
import za.ac.mkums.cput.domain.polymorphism.Sports;
import za.ac.mkums.cput.domain.polymorphism.Tennis;


/**
 * Created by Songezo on 2016-03-20.
 */
public class TestPolymorphism {


    private Sports sport[];

    @Before
    public void setUp() throws Exception {
        sport = new Sports[3];
        sport[0] = new Soccer();
        sport[1] = new BasketBall();
        sport[2] = new Tennis();
    }

    @Test
    public void testPolymorphic() throws Exception {

        System.out.print("Tennis: " + sport[2].playing() + "\n");
        System.out.print("Basketball: " + sport[1].playing() + "\n");
        System.out.print("Soccer: " + sport[0].playing() + "\n");

        Assert.assertSame(sport[0].playing(), sport[2].playing());

    }

    @After
    public void tearDown() throws Exception {

    }
}
