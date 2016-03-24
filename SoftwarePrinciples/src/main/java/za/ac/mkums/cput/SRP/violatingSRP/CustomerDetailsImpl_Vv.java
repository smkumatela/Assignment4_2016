package za.ac.mkums.cput.SRP.violatingSRP;

/**
 * Created by Songezo on 2016-03-24.
 */
public class CustomerDetailsImpl_Vv implements CustomerDStv_Account_Vv {

    public String customerDetails() {
        return "Acc Holder: Songezo \n Acc Type: Premium \n Type of Dish: Elset";
    }

    public int numberOfChannels() {
        return 119;
    }

    public double monthy_Installment() {
        return 625;
    }
}
