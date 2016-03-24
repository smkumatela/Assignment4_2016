package za.ac.mkums.cput.OCP_Test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.mkums.cput.OCP.violateOCP.CalculateArea_Vv;
import za.ac.mkums.cput.config.AppConfig;

/**
 * Created by Songezo on 2016-03-24.
 */
public class AreaCircle_Test {

    private CalculateArea_Vv area_vv;
    private ApplicationContext context;

    @Before
    public void setUp() throws Exception {
        context = new AnnotationConfigApplicationContext(AppConfig.class);
        area_vv = (CalculateArea_Vv) context.getBean("Circle Area");
    }

    @Test
    public void testCircle() throws Exception {
        Assert.assertEquals("radius * radius * PI", area_vv.AreaChoice(1));
    }
}
