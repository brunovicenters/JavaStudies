import points.CalculateBonus;
import points.SettingPoints;
import points.User;

public class Main {
    public static void main(String[] args) {

        // Normal User
        User u = new User();
        u.name = "Vicente";
        CalculateBonus cb = new CalculateBonus();
        SettingPoints sp = new SettingPoints(cb);
        sp.createTopic(u);
        System.out.println(u.points);

        // Vip User
        User uVip = new User();
        uVip.name = "Vicente";
        uVip.vip = true;
        CalculateBonus cbVip = new CalculateBonus();
        SettingPoints spVip = new SettingPoints(cbVip);
        spVip.createTopic(uVip);
        System.out.println(uVip.points);

        // Normal User + Special Bonus Day
        User u2 = new User();
        u2.name = "Vicente";
        CalculateBonus cb2 = new CalculateBonus();
        cb2.bonusDay = 3;
        SettingPoints sp2 = new SettingPoints(cb2);
        sp2.createTopic(u2);
        System.out.println(u2.points);

        // Vip User + Special Bonus Day
        User uVip2 = new User();
        uVip2.name = "Vicente";
        uVip2.vip = true;
        CalculateBonus cbVip2 = new CalculateBonus();
        cbVip2.bonusDay = 2;
        SettingPoints spVip2 = new SettingPoints(cbVip2);
        spVip2.createTopic(uVip2);
        System.out.println(uVip2.points);
    }
}