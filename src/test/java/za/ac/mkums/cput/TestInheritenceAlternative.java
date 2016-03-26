package za.ac.mkums.cput;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.mkums.cput.domain.inheritenceAlternative.Food_A;
import za.ac.mkums.cput.domain.inheritenceAlternative.Pasta_A;
import za.ac.mkums.cput.domain.inheritenceAlternative.Rice_A;

/**
 * Created by Songezo on 2016-03-26.
 */
public class TestInheritenceAlternative {

    private Food_A food_a;
    private Pasta_A pastaA;
    private Rice_A riceA;

    @Before
    public void setUp() throws Exception {
        food_a = new Food_A();
        pastaA = new Pasta_A();
        riceA = new Rice_A();
    }

    @Test
    public void testCopmosition() throws Exception {

        System.out.print("composition from the Pasta class: " + pastaA.eat() + "\n");
        System.out.print("composition from the Rice class: " + riceA.eat() + "\n");
        System.out.print("composition from the Food class: " + food_a.eat());

        Assert.assertSame(pastaA.eat(), food_a.eat());
        Assert.assertSame(riceA.eat(), food_a.eat());
        Assert.assertSame(pastaA.eat(), riceA.eat());
    }
}
