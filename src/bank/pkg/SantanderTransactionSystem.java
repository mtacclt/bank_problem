package bank.pkg;

public class SantanderTransactionSystem implements TransactionSystem{

    private SantanderBank bank;
    public SantanderTransactionSystem(SantanderBank bank){
        this.bank = bank;
        bank.setTransactionSystem(this);
    }

    @Override
    public void processTransaction(SantanderWithdrawalTransaction transaction) {
        Thread transactionThread = new Thread(transaction,"transactionThread");
        transactionThread.start();
    }

    public void processTransaction(SantanderDepositTransaction transaction) {
        Thread transactionThread = new Thread(transaction,"transactionThread");
        transactionThread.start();
    }

    public void createTransaction(int transactionCode,int customerId,int value){
        if (transactionCode == 1){
            SantanderDepositTransaction transaction = new SantanderDepositTransaction(this.bank,customerId,value);

            System.out.println("created deposit transaction, values: "+customerId+value);
            this.processTransaction(transaction);
        }else {
            SantanderWithdrawalTransaction transaction = new SantanderWithdrawalTransaction(this.bank,customerId,value);
            System.out.println("created withdrawal transaction, values: "+customerId+value);
            this.processTransaction(transaction);
        }
    }
}
