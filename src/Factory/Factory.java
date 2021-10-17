package Factory;
import Transport.*;

public class Factory {

    public Transport createTransport(String[] types){
        Transport l = new Transport() {};
        for (String i:types){
            System.out.println(i);
        }
        return l;
    }
}
