package Factory;
import Transport.*;

public class Factory {
    public Transport createTransport(String type){
        Transport transport = null;
            switch (type) {
                case "0":
                    transport = new Bike();
                    break;
                case "1":
                    transport = new Scooter();
                    break;
                case "2":
                    transport = new Car();
                    break;
                case "3":
                    transport = new Bus();
                    break;
                default:
                    transport = new Unknown();
            }
        return transport;
    }
}
