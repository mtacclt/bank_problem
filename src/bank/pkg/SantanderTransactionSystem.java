package bank.pkg;

public class SantanderTransactionSystem implements TransactionSystem{

    private SantanderBank bank;
    public SantanderTransactionSystem(SantanderBank bank){
        this.bank = bank;
    }

    @Override
    public void processTransaction(Object transaction) {
        //    if (obj instanceof C) {
        ////your code
        //    }
    }
}
