package vehicles;

    public class Main {
        public static void main(String[] args) {
            Car c1 = new Car();
            c1.enginePower = 10;
            c1.speed = 0;
            c1.name = "Alicia";

                    c1.accelerate();

                    c1.print();
        }
    }