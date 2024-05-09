import veiculos.Carro;
import veiculos.Moto;

public class Main {
    public static void main(String[] args) {
        Carro c = new Carro("Hyundai", "Creta", 2020, 32000.50, 4);
        Moto m = new Moto("Hyundai", "Razor", 2023, 13000.75, true);


        System.out.println(c.toString());
        System.out.println(m.toString());
    }
}