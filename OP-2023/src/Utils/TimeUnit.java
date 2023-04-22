package Utils;

public class TimeUnit {
    private int InSecond;
    private int Equal;
    private String[] formats;

    public TimeUnit(int inSecond, String[] formats){
        InSecond = inSecond;
    }

    public int getSeconds(StringBuilder sb, int seconds){
        Equal = seconds / InSecond;
        seconds -= Equal * InSecond;

        getString(sb);
        return seconds;
    }

    private void getString(StringBuilder sb){
        if (Equal < 0) {
            return;
        }

        appendDelimiter(sb);
        sb.append(Equal).append(" ").append(formatWord(Equal, formats[0], formats[1], formats[2]));
    }

    private String formatWord(int number, String form1, String form2, String form5) {
        if (number % 10 == 1 && number % 100 != 11) {
            return form1;
        } else if (number % 10 >= 2 && number % 10 <= 4 && (number % 100 < 10 || number % 100 >= 20)) {
            return form2;
        } else {
            return form5;
        }
    }

    private void appendDelimiter(StringBuilder sb) {
        if (sb.length() > 0) {
            sb.append(", ");
        }
    }
}
