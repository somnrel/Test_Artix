package Transport;

public class Car extends Transport{
    String body;
    public Car(String Name, int MaxSpeed, int Wheels, String Body){
        this.name = Name;
        this.maxSpeed = MaxSpeed;
        this.wheels = Wheels;
        this.body = Body;
    }

    @Override
    public void printValues() {
        System.out.println("Наименование транспорта: " + this.name);
        System.out.println("Максимальная скорость: " + this.maxSpeed);
        System.out.println("Кол-во колес: " + this.wheels);
        System.out.println("Кузов: " + this.body);
    }
}
