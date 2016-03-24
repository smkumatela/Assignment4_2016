package za.ac.mkums.cput.SRP_Test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.mkums.cput.SRP.violatingSRP.CustomerDStv_Account_Vv;
import za.ac.mkums.cput.config.AppConfig;

/**
 * Created by Songezo on 2016-03-24.
 */
public class DStvChannels_Test {

    private CustomerDStv_Account_Vv account_vv;
    private ApplicationContext ctx;

    @Before
    public void setUp() throws Exception {
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        account_vv = (CustomerDStv_Account_Vv) ctx.getBean("Account_Vv");
    }

    @Test
    public void testChannels() throws Exception {
        Assert.assertEquals("Number of Channels", 119, account_vv.numberOfChannels());
    }

    @After
    public void tearDown() throws Exception {

    }
}
