package bank.pkg;

public class SantanderWithdrawalTransaction implements Transaction,Runnable {
    private SantanderBank bank;
    private int id;
    private int value;

    public SantanderWithdrawalTransaction(SantanderBank bank, int id, int value) {
        this.bank = bank;
        this.id = id;
        this.value = value * (-1);
    }

    @Override
    public void runTransaction() {
        SantanderUpdateOperation operation = this.bank.getStorageSystem().createUpdateOperation(this.id, this.value);
        System.out.println("ran withdrawal transaction, values: "+id+" "+value);
        this.bank.getStorageSystem().performOperation(operation);
    }

    @Override
    public void run () {
        this.runTransaction();
    }
}