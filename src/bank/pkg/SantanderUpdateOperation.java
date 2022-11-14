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
        this.storage.getAccounts().replace(key,replacementValue);
    }

    @Override
    public void run() {
    // run thread that processes the operation
    }
}
