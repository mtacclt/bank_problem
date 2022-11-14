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

    public void createTransaction(int transactionCode,int customerId,int value){
        if (transactionCode == 1){
            DepositTransaction transaction = new DepositTransaction();
            System.out.println("created deposit transaction");
        }else {
            WithdrawalTransaction transaction = new WithdrawalTransaction();
            System.out.println("created withdrawal transaction");
        }
    }
}
