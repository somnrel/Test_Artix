package Transport;

public class Car extends Transport{
    final String Name = "Автомобиль";
    final int  MaxSpeed = 160;
    final byte Wheels = 4;
    final String Body = "Хэтчбэк";

    @Override
    public void printParam() {
        System.out.println("Наименование транспорта: " + this.Name);
        System.out.println("Максимальная скорость: " + this.MaxSpeed);
        System.out.println("Кол-во колес: " + this.Wheels);
        System.out.println("Кузов: " + this.Body);
    }
}
