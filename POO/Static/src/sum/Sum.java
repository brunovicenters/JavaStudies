package sum;

public class Sum {
    public String name;
    int sumObj;
    static int sumAll;

    public void sum(){
        ++sumObj;
        ++sumAll;
    }

    public void print(){
        System.out.println("The counter"+name+" for obj "+sumObj+" and for all "+sumAll);
    }
}
