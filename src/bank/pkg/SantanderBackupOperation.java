package bank.pkg;

import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SantanderBackupOperation implements Operation,Runnable{

    private SantanderStorage storage;
    private int key;
    private int value;

    public SantanderBackupOperation(SantanderStorage storage,int key, int value) {
        this.storage = storage;
        this.key = key;
        this.value = value;
    }

    @Override
    public void runOperation() {
        synchronized (this.storage.getBackup()){
            this.storage.getBackup().replace(this.key,this.value);
            this.storage.getBackup().notifyAll();
        }
    }
    @Override
    public void run() {
    this.runOperation();
    }
}
