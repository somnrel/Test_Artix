package Transport;

public class Bus extends Transport{
    int capacity;
    public Bus(String Name, int MaxSpeed, int Wheels, int Capacity){
        this.name = Name;
        this.maxSpeed = MaxSpeed;
        this.wheels = Wheels;
        this.capacity = Capacity;
    }

    @Override
    public void printParam() {
        System.out.println("Наименование транспорта: " + this.name);
        System.out.println("Максимальная скорость: " + this.maxSpeed);
        System.out.println("Кол-во колес: " + this.wheels);
        System.out.println("Вместимость: " + this.capacity);
    }
}
