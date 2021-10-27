package Factory;
import Transport.*;

public class Factory {
    public Transport createTransport(String type){
        Transport transport = null;
            switch (type) {
                case "0":
                    transport = new Bike("Мотоцикл", 200, 2, "Kawasaki");
                    break;
                case "1":
                    transport = new Scooter("Самокат", 30, 2, "Спортивный");
                    break;
                case "2":
                    transport = new Car("Автомобиль", 160, 4, "Хэтчбэк");
                    break;
                case "3":
                    transport = new Bus("Автобус", 120, 4, 42);
                    break;
                default:
                    transport = new Unknown();
            }
        return transport;
    }
}
