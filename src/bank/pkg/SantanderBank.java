package bank.pkg;

public class SantanderBank extends AbstractBank{
    private String name;
    private String Location;
    private SantanderStorageSystem storageSystem;
    private SantanderTransactionSystem transactionSystem;

    public SantanderBank(String name, String location) {
        super(name, location);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
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
