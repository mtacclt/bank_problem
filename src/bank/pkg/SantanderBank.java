package bank.pkg;

public class SantanderBank extends AbstractBank{
    private String name;
    private String location;
    private SantanderStorageSystem storageSystem;
    private SantanderTransactionSystem transactionSystem;

    public SantanderBank(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getlocation() {
        return location;
    }

    public void setLocation(String location) {
        location = location;
    }

    public SantanderStorageSystem getStorageSystem() {
        return storageSystem;
    }

    public void setStorageSystem(SantanderStorageSystem storageSystem) {
        this.storageSystem = storageSystem;
    }

    public SantanderTransactionSystem getTransactionSystem() {
        return transactionSystem;
    }

    public void setTransactionSystem(SantanderTransactionSystem transactionSystem) {
        this.transactionSystem = transactionSystem;
    }
}
