package za.ac.mkums.cput.OCP_Test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.mkums.cput.OCP.obeyingOCP.AreaCalculator;
import za.ac.mkums.cput.OCP.obeyingOCP.AreaRectangleImpl;
import za.ac.mkums.cput.config.AppConfig;

/**
 * Created by Songezo on 2016-03-24.
 */
public class AreaRectangle_Test {

    private AreaCalculator areaCalculator;
    private ApplicationContext ctx;

    @Before
    public void setUp() throws Exception {
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        areaCalculator = (AreaCalculator) ctx.getBean("rectangle");
    }

    @Test
    public void testRectangle() throws Exception {
        Assert.assertEquals("width * height", ((AreaRectangleImpl) areaCalculator).rectangleArea());
    }

    @After
    public void tearDown() throws Exception {

    }
}
