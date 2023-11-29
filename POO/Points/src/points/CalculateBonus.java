package points;

public class CalculateBonus {
    public int bonusDay = 1;

    public int bonus(User u){
        int multiplicate = bonusDay;
        if (u.vip)
            multiplicate *= 5;
        return multiplicate;
    }
}
