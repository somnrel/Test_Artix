package Transport;

public class Scooter extends Transport {
    final String Name = "Самокат";
    final int  MaxSpeed = 30;
    final byte Wheels = 2;
    final String Type = "Спортивный";

    @Override
    public void printParam() {
        System.out.println("Наименование транспорта: " + this.Name);
        System.out.println("Максимальная скорость: " + this.MaxSpeed);
        System.out.println("Кол-во колес: " + this.Wheels);
        System.out.println("Вид самоката: " + this.Type);
    }
}
