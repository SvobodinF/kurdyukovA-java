package CP4;

import Utils.*;

public class Task41 implements Debuggable {
    @Override
    public void invoke() {
        int secondCount = 37584129;

        System.out.println(calculateTime(secondCount));
    }

    public static String calculateTime(int seconds) {
        if (seconds < 0) {
            throw new IllegalArgumentException("Время не может быть отрицательным");
        }

        if (seconds == 0) {
            return "0 секунд";
        }

        TimeUnit[] units = {
                new TimeUnit(365 * 24 * 60 * 60, new String[]{"год", "года", "лет"}),
                new TimeUnit(30 * 24 * 60 * 60, new String[]{"месяц", "месяца", "месяцев"}),
                new TimeUnit(7 * 24 * 60 * 60, new String[]{"неделя", "недели", "недель"}),
                new TimeUnit(24 * 60 * 60, new String[]{"день", "дня", "дней"}),
                new TimeUnit(60 * 60, new String[]{"час", "часа", "часов"}),
                new TimeUnit(60, new String[]{"минута", "минуты", "минут"}),
                new TimeUnit(1, new String[]{"секунда", "секунды", "секунд"})
        };


        for (int i = 0; i < units.length; i++){
            seconds = units[i].getSeconds(seconds);
        }

        String result = "";

        for (int i = 0; i < units.length; i++){
            if (i != units.length - 1 && i != 0){
                result += " и ";
            }
            else {
                char c = ' ';
                result += c;
            }

            result += units[i].getString();
        }

        return result;
    }
}
