package points;

public class SettingPoints {

    private CalculateBonus bonus;

    public SettingPoints(CalculateBonus cb) {
        this.bonus = cb;
    }
    public void makeComment(User u) {
        u.points += 3 * bonus.bonus(u);
    }

    public void createTopic(User u) {
        u.points += 5 * bonus.bonus(u);
    }

    public void giveALike(User u){
        u.points += bonus.bonus(u);
    }
}
