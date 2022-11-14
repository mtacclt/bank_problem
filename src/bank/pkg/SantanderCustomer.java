package bank.pkg;

public class SantanderCustomer extends AbstractCustomer{
    private String name;
    private int id;

    private SantanderTransactionSystem transactionSystem;

    public SantanderCustomer(String name, int id) {
        super(name, id);
    }

    public SantanderCustomer(String name, int id,SantanderTransactionSystem transactionSystem) {
        super(name, id);
        this.transactionSystem = transactionSystem;
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

    public void deposit(int value){
        this.transactionSystem.createTransaction(1,this.id,value);
    }

    public void withdraw(int value){
        this.transactionSystem.createTransaction(2,this.id,value);
    }


}
