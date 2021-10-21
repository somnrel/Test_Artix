package Transport;

public abstract class Transport {
    String Name;
    byte Wheels;
    int MaxSpeed;


    public void printParam(){
        System.out.println(this.Name);
        System.out.println(this.MaxSpeed);
        System.out.println(this.Wheels);
    }
}
