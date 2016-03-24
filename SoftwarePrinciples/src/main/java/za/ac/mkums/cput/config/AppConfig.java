package za.ac.mkums.cput.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import za.ac.mkums.cput.LSP.obeyingLSP.BankTransactions;
import za.ac.mkums.cput.LSP.obeyingLSP.TypeOfTransactionImpl;
import za.ac.mkums.cput.LSP.violateLSP.BankTransfareImpl;
import za.ac.mkums.cput.OCP.obeyingOCP.AreaCalculator;
import za.ac.mkums.cput.OCP.obeyingOCP.AreaRectangleImpl;
import za.ac.mkums.cput.OCP.violateOCP.CalculateArea_Vv;
import za.ac.mkums.cput.OCP.violateOCP.CalculateArea_VvImpl;
import za.ac.mkums.cput.SRP.obeyingSRP.CustomerDStv_Account;
import za.ac.mkums.cput.SRP.obeyingSRP.CustomerDStv_Payment;
import za.ac.mkums.cput.SRP.obeyingSRP.CustomerDStv_Payment_Impl;
import za.ac.mkums.cput.SRP.obeyingSRP.CustomerDetailsImpl;
import za.ac.mkums.cput.SRP.violatingSRP.CustomerDStv_Account_Vv;
import za.ac.mkums.cput.SRP.violatingSRP.CustomerDetailsImpl_Vv;

/**
 * Created by Songezo on 2016-03-23.
 */
@Configuration
public class AppConfig {

    /**********     LSP     *****************/

    @Bean(name = "deposite")
    public BankTransactions getDeposite(){
        return new TypeOfTransactionImpl();
    }
    @Bean(name = "transfare")
    public BankTransactions getTransfare(){
        return new BankTransfareImpl();
    }


    /**********     OCP     *****************/

    @Bean(name = "Circle Area")
    public CalculateArea_Vv getAreaChoice(){
        return new CalculateArea_VvImpl();
    }

    @Bean(name = "rectangle")
    public AreaCalculator getRectangleArea(){
        return new AreaRectangleImpl();
    }


    /**********     OCP     *****************/

    @Bean(name = "DStv_Installment")
    public CustomerDStv_Account getInstallment(){
        return new CustomerDetailsImpl();
    }

    @Bean(name = "DStv_Payment")
    public CustomerDStv_Payment getPayment(){
        return new CustomerDStv_Payment_Impl();
    }

    @Bean(name = "Account_Vv")
    public CustomerDStv_Account_Vv getAccount(){
        return new CustomerDetailsImpl_Vv();
    }
}
