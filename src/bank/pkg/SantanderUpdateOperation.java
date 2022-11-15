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
        System.out.println("key: "+key+" value: "+value);
        int replacementValue = this.storage.getAccounts().get(key) + value;
        System.out.println("ran update operation");
        synchronized (this.storage.getAccounts()){
            this.storage.getAccounts().replace(key,replacementValue);
            System.out.println("replaced value");
            System.out.println("new value is"+this.storage.getAccounts().get(key));
            this.storage.getAccounts().notifyAll();
        }

    }

    @Override
    public void run() {
    this.runOperation();
    }
}
