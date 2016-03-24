package za.ac.mkums.cput.LSP.violateLSP;

import za.ac.mkums.cput.LSP.obeyingLSP.BankTransactions;

/**
 * Created by Songezo on 2016-03-23.
 */
public class BankTransfareImpl implements BankTransactions {

    int money = 0;

    public String transactionName() {
        return "transfare";
    }

    public int depositeMoney() {
        throw new UnsupportedOperationException() ;
    }
}
