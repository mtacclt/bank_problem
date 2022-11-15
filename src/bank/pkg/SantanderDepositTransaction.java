package bank.pkg;

public class SantanderDepositTransaction implements Transaction,Runnable{
    private SantanderBank bank;
    private int id;
    private int value;

    public SantanderDepositTransaction(SantanderBank bank,int id,int value){
        this.bank = bank;
        this.id = id;
        this.value = value;
    }
    @Override
    public void runTransaction() {
        SantanderUpdateOperation operation = this.bank.getStorageSystem().createUpdateOperation(this.id,this.value);
        System.out.println("ran deposit transaction, values: "+id+" "+value);
        this.bank.getStorageSystem().performOperation(operation);
    }

    @Override
    public void run() {
        this.runTransaction();
    }
}
