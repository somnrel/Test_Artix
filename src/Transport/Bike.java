package Transport;

public class Bike extends Transport{
    String brand;
    public Bike(String Name, int MaxSpeed, int Wheels, String Brand){
        this.name = Name;
        this.maxSpeed = MaxSpeed;
        this.wheels = Wheels;
        this.brand = Brand;
    }

    @Override
    public void printValues() {
        System.out.println("Наименование транспорта: " + this.name);
        System.out.println("Максимальная скорость: " + this.maxSpeed);
        System.out.println("Кол-во колес: " + this.wheels);
        System.out.println("Марка мотоцикла: " + this.brand);
    }
}

