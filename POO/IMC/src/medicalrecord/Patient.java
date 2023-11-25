package medicalrecord;

public class Patient {
    double weight;
    double height;

    public Patient(double weight, double height){
        this.weight = weight;
        this.height = height;
    }

    public double calculateBMI(){
        return weight/(height*height);
    }

    public String diagnosis(){
        double imc = calculateBMI();
        String diagnosis = null;
        if (imc < 16){
            diagnosis = "Weight too low, high risk";
        } else if (imc >= 16 && imc < 17) {
            diagnosis = "Weight too low, risky";
        } else if (imc >= 17 && imc < 18.5) {
            diagnosis = "Low weight";
        } else if (imc >= 18.5 && imc < 25) {
            diagnosis = "Normal weight";
        } else if (imc >= 25 && imc < 30) {
            diagnosis = "Overweight";
        } else if (imc >= 30 && imc < 35) {
            diagnosis = "Obesity grade I";
        } else if (imc >= 35 && imc < 40) {
            diagnosis = "Obesity grade II";
        } else if (imc >= 40) {
            diagnosis = "Obesity grade III (Morbid obesity)";
        }
        return diagnosis;
    }
}
