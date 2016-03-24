package za.ac.mkums.cput.SRP_Test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.mkums.cput.SRP.obeyingSRP.CustomerDStv_Payment;
import za.ac.mkums.cput.config.AppConfig;

/**
 * Created by Songezo on 2016-03-24.
 */
public class CustomerDStv_Payment_Test {

    private CustomerDStv_Payment payment;
    private ApplicationContext appl;

    @Before
    public void setUp() throws Exception {
        appl = new AnnotationConfigApplicationContext(AppConfig.class);
        payment = (CustomerDStv_Payment) appl.getBean("DStv_Payment");
    }

    @Test
    public void testPayment() throws Exception {
        Assert.assertEquals("DStv Payment", 625, payment.monthy_Installment(), 0.0);
    }

    @After
    public void tearDown() throws Exception {

    }
}
