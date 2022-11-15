package bank.pkg;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class SantanderUpdateOperation implements Operation,Runnable{
    private SantanderStorage storage;
    private int key;
    private int value;

    private ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();

    public SantanderUpdateOperation(SantanderStorage storage,int key,int value) {
        this.storage = storage;
        this.key = key;
        this.value = value;
    }

    @Override
    public void runOperation() {
        int replacement =readMap(key)+value;
        updateMap(key,replacement);
    }

    public int readMap (int key){
        return this.storage.getAccounts().get(key);
    }

    public void updateMap (int key,int replacementValue){
        this.storage.getAccounts().replace(key,replacementValue);
    }

    @Override
    public void run() {
    this.runOperation();
    }
}
