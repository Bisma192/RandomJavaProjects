public class Car extends Vehicle
{
    protected int cc;
    protected int gears;

    public Car(String name, int speed, int size, int cc, int gears)
    {
        super(name,speed,size);
        this.cc= cc;
        this.gears=gears;
    }

    void attributesCar()
    {
        System.out.println(" colour is " + color);
        System.out.println(" speed is " + speed);
        System.out.println(" size is " + size);
        System.out.println(" cc is " + cc);
        System.out.println(" gear is " + gears);

    }

}
