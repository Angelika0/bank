import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Generatory {
    int id = 1;
    public int generujId() {
        return id++;
    }
    public  String generujNumerKonta() {
        List<String> cyfry = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            cyfry.add(i+"");
        }
        
        Collections.shuffle(cyfry);
        
        StringBuilder numerKonta = new StringBuilder();
        for (int i = 0; i < 2; i++) {
            numerKonta.append(cyfry.get(i));
        }
        
        return numerKonta.toString();
    }


    
}
