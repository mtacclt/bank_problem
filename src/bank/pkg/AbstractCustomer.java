package bank.pkg;

public abstract class AbstractCustomer {
    private String name;
    private int id;

    public AbstractCustomer(String name, int id) {
        this.name = name;
        this.id = id;
    }
}
