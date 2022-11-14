package bank.pkg;

public class SantanderUpdateOperation implements Operation,Runnable{
    private SantanderStorage storage;
    private int key;
    private int value;

    public SantanderUpdateOperation(SantanderStorage storage,int key,int value) {
        this.storage = storage;
        this.key = key;
        this.value = value;
    }

    @Override
    public void runOperation() {
        int replacementValue = this.storage.getAccounts().get(key) + value;
        synchronized (this.storage.getAccounts()){
            this.storage.getAccounts().replace(key,replacementValue);
            this.storage.getAccounts().notifyAll();
        }

    }

    @Override
    public void run() {
    this.runOperation();
    }
}
