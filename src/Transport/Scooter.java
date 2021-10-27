package Transport;

public class Scooter extends Transport {
    String type;
    public Scooter(String Name, int MaxSpeed, int Wheels, String Type){
        this.name = Name;
        this.maxSpeed = MaxSpeed;
        this.wheels = Wheels;
        this.type = Type;
    }

    @Override
    public void printParam() {
        System.out.println("Наименование транспорта: " + this.name);
        System.out.println("Максимальная скорость: " + this.maxSpeed);
        System.out.println("Кол-во колес: " + this.wheels);
        System.out.println("Вид самоката: " + this.type);
    }
}
