package za.ac.mkums.cput.LSP.obeyingLSP;

/**
 * Created by Songezo on 2016-03-23.
 */
public class TypeOfTransactionImpl implements BankTransactions {

    int money = 1;

    public String transactionName() {
        return "depositing";
    }

    public int depositeMoney() {
        return ++ money;
    }
}
