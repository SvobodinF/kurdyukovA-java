package CP4;

import Utils.Debuggable;
import Utils.TimeUnit;

public class Task41 implements Debuggable {
    @Override
    public void invoke() {
        int secondCount = 356;

        System.out.println(calculateTime(secondCount));
    }

    public static String calculateTime(int seconds) {
        if (seconds < 0) {
            throw new IllegalArgumentException("Время не может быть отрицательным");
        }

        if (seconds == 0) {
            return "0 секунд";
        }

        TimeUnit year = new TimeUnit(365 * 24 * 60 * 60, new String[]{"год", "года", "лет"});
        TimeUnit month = new TimeUnit(30 * 24 * 60 * 60, new String[]{"месяц", "месяца", "месяцев"});
        TimeUnit week = new TimeUnit(7 * 24 * 60 * 60, new String[]{"неделя", "недели", "недель"});
        TimeUnit day = new TimeUnit(24 * 60 * 60, new String[]{"день", "дня", "дней"});
        TimeUnit hour = new TimeUnit(60 * 60, new String[]{"час", "часа", "часов"});
        TimeUnit minute = new TimeUnit(60, new String[]{"минута", "минуты", "минут"});
        TimeUnit second = new TimeUnit(1, new String[]{"секунда", "секунды", "секунд"});

        StringBuilder sb = new StringBuilder();
        seconds = year.getSeconds(sb, seconds);
        seconds = month.getSeconds(sb, seconds);
        seconds = week.getSeconds(sb, seconds);
        seconds = day.getSeconds(sb, seconds);
        seconds = hour.getSeconds(sb, seconds);
        seconds = minute.getSeconds(sb, seconds);
        seconds = second.getSeconds(sb, seconds);

        return sb.toString();
    }
}
