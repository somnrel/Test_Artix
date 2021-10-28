package Transport;

public abstract class Transport {
    String name;
    int maxSpeed;
    int wheels;

    public void printValues(){
        System.out.println(this.name);
        System.out.println(this.maxSpeed);
        System.out.println(this.wheels);
    }
}
