package bank.pkg;

public abstract class AbstractBank {
    private String name;
    private String location;

    public AbstractBank(String name, String location) {
        this.name = name;
        this.location = location;
    }
}
