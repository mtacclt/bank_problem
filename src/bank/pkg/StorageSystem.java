package bank.pkg;

public interface StorageSystem {
    public void performOperation(SantanderUpdateOperation operation);

    public void performBackup();
}
