public class Vehicle
{
        protected String color;
        protected int speed;
        protected int size;

        public Vehicle(String color, int speed, int size)
        {
            this.color=color;
            this.speed=speed;
            this.size=size;
        }

        void attributesVehicle()
        {
            System.out.println(" colour is " + color);
            System.out.println(" speed is " + speed);
            System.out.println(" size is " + size);

        }




}
