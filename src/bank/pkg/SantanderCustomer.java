package bank.pkg;

public class SantanderCustomer extends AbstractCustomer{
    private String name;
    private int id;

    public SantanderCustomer(String name, int id) {
        super(name, id);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
