import java.util.List;
import java.util.ArrayList;
import java.util.Collections;


public class Client {
    private String name;
    private String surname;
    private int Id;
    private List<NormalAccaount> normalAccaounts = new ArrayList<NormalAccaount>();
    private List<SavingAccaunt> savingAccaunts = new ArrayList<SavingAccaunt>();

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

    

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }
    public void addNormalAccaount(NormalAccaount normalAccaount){
        normalAccaounts.add(normalAccaount);
    }
    public void delateNormalAccaount(String numerKonta){
        for(NormalAccaount normalAccaount : normalAccaounts){
            if(normalAccaount.getNumerKonta() == numerKonta){
                normalAccaounts.remove(normalAccaount);
            }
        }
    }
    public void addSavingAccaount(SavingAccaunt savingAccaunt){
        savingAccaunts.add(savingAccaunt);
    }
    public void delateSavingAccaount(SavingAccaunt savingAccaunt){
        savingAccaunts.remove(savingAccaunt);
    }
  
   public String findeNormalAccaount(String numerKonta){
        NormalAccaount normalAccaountf = new NormalAccaount();
        for(NormalAccaount normalAccaount : normalAccaounts){
            if(normalAccaount.getNumerKonta() == numerKonta){
                normalAccaountf = normalAccaount;
            }
        }
        return normalAccaountf.toString();
    }

    @Override
    public String toString() {
        return  "\n"+
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", Id=" + Id + "\n"+
                ' ';
    }
    
    public String toString2() {
        return  "\n"+
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", Id=" + Id + ", NormalAccaounts: " + normalAccaounts + "\n"+ ", SavingAccaunts: " + savingAccaunts + "\n " +
                ' ';
    }
}
