package Transport;

public class Bike extends Transport{
    final String Name = "Мотоцикл";
    final int  MaxSpeed = 200;
    final byte Wheels = 2;
    final String Brand = "Kawasaki";

    @Override
    public void printParam() {
        System.out.println("Наименование транспорта: " + this.Name);
        System.out.println("Максимальная скорость: " + this.MaxSpeed);
        System.out.println("Кол-во колес: " + this.Wheels);
        System.out.println("Марка мотоцикла: " + this.Brand);
    }
}

