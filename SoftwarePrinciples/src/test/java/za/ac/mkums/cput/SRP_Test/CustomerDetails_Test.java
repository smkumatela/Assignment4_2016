package za.ac.mkums.cput.SRP_Test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.mkums.cput.SRP.obeyingSRP.CustomerDStv_Account;
import za.ac.mkums.cput.config.AppConfig;

/**
 * Created by Songezo on 2016-03-24.
 */
public class CustomerDetails_Test {

    private CustomerDStv_Account account;
    private ApplicationContext ctx;
    private String acc = "Acc Holder: Songezo \n Acc Type: Premium \n Type of Dish: Elset";

    @Before
    public void setUp() throws Exception {
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        account = (CustomerDStv_Account) ctx.getBean("DStv_Installment");
    }

    @Test
    public void testDetails() throws Exception {
        Assert.assertSame(acc, account.customerDetails());
    }

    @After
    public void tearDown() throws Exception {

    }
}
