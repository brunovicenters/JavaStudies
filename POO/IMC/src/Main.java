import medicalrecord.Patient;

public class Main {
    public static void main(String[] args) {
        Patient p1 = new Patient(54.30, 1.67);
        Patient p2 = new Patient(49, 1.67);
        Patient p3 = new Patient(90, 1.50);

        System.out.println("Pacient 1 has an BMI of: ");
        System.out.println(p1.calculateBMI());
        System.out.println("Pacient 1 has a diagnosis of: ");
        System.out.println(p1.diagnosis());

        System.out.println(" ");
        System.out.println("Pacient 2 has an BMI of: ");
        System.out.println(p2.calculateBMI());
        System.out.println("Pacient 2 has a diagnosis of: ");
        System.out.println(p2.diagnosis());

        System.out.println(" ");
        System.out.println("Pacient 3 has an BMI of: ");
        System.out.println(p3.calculateBMI());
        System.out.println("Pacient 3 has a diagnosis of: ");
        System.out.println(p3.diagnosis());
    }
}