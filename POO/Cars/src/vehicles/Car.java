// Organize your classes in packages --
package vehicles;

        // Create Class --
        public class Car {
            // Set its attributes --
            int enginePower;
            float speed;
            String name;

            // You can create methods --

            // "void" means it won't return something | your method can have parameters --
            void accelerate(){
                speed += enginePower;
            }

            void stop(){
                speed *= 0.5;
            }

            float getSpeed(){
                return speed;
            }

            void print(){
                System.out.println("Car "+name+" is at "+getSpeed()+" km/h");
            }
        }

        // To create a "Car", you type --
        // `Car bmw = new Car();`

        // To access and edit its atributtes --
        // bmw.enginePower;
        // bmw.speed = 5;

        // To access its methods --
        // bmw.accelerate();
        // bmw.stop();