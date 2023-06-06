import java.util.List;

public class Client {
    private String name;
    private String surname;
    private int Id;
    private List<Account> accounts;
    public Client(){
        this.name="unknown";
        this.surname="unknow";
        this.Id= 00000;

    }
    public Client(String name, String surname, int Id){
        this.name=name;
        this.surname=surname;
        this.Id= Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public List<Account> getAcco() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    @Override
    public String toString() {
        return "Client:" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", Id=" + Id +
                ' ';
    }
}
