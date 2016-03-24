package za.ac.mkums.cput.LSP_Test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.mkums.cput.config.AppConfig;
import za.ac.mkums.cput.LSP.obeyingLSP.BankTransactions;

/**
 * Created by Songezo on 2016-03-23.
 */
public class TransfareTest {

    private BankTransactions trans;
    private ApplicationContext context;

    @Before
    public void setUp() throws Exception {
        context = new AnnotationConfigApplicationContext(AppConfig.class);
        trans = (BankTransactions) context.getBean("transfare");
    }

    @Test
    public void testTransfare() throws Exception {
        Assert.assertNotEquals(1, trans.depositeMoney());
    }

    @After
    public void tearDown() throws Exception {

    }
}
