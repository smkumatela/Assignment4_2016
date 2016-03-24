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
public class DepositeTest {

    private BankTransactions bank;
    private ApplicationContext ctx;

    @Before
    public void setUp() throws Exception {
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        bank = (BankTransactions) ctx.getBean("deposite");
    }

    @Test
    public void testDeposites() throws Exception {
        Assert.assertEquals("are they the same", 2, bank.depositeMoney());
    }

    @After
    public void tearDown() throws Exception {

    }
}
