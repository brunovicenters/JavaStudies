package math;

public class Calculator {
    public double fNumber;
    public double sNumber;

    public Calculator(double fNumber, double sNumber){
        this.fNumber = fNumber;
        this.sNumber = sNumber;
    }

    public double add(){
        return fNumber+sNumber;
    }

    public double sub(){
        return fNumber-sNumber;
    }

    public double mul(){
        return fNumber*sNumber;
    }

    public double div(){
        return fNumber/sNumber;
    }

    public double mod(){
        return fNumber%sNumber;
    }

    public double pow(){
        return Math.pow(fNumber, sNumber);
    }
}
