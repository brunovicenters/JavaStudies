package vehicles;

    public class Main {

        // Establishing main method --
        public static void main(String[] args) {
            // Creating a new car --
            Car c1 = new Car();
            // Setting its attributes --
            c1.enginePower = 10;
            c1.speed = 0;
            c1.name = "Alicia";

            // Creating a new car --
            Car c2 = new Car();
            // Setting its attributes --
            c2.enginePower = 25;
            c2.speed = 0;
            c2.name = "Sofia";

            // Calling their methods --
            for (int i = 0; i<3; ++i){
                c1.accelerate();
            }
            c1.stop();

            c2.accelerate();
            c2.accelerate();

            c1.print();
            c2.print();
        }
    }