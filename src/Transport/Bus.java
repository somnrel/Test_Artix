package Transport;

public class Bus extends Transport{
    final String Name = "Автобус";
    final int  MaxSpeed = 120;
    final byte Capacity = 42;

    @Override
    public void printParam() {
        System.out.println("Наименование транспорта: " + this.Name);
        System.out.println("Максимальная скорость: " + this.MaxSpeed);
        System.out.println("Кол-во колес: " + this.Wheels);
        System.out.println("Вместимость: " + this.Capacity);
    }
}
