package Utils;

public class TimeUnit {
    private int InSecond;
    private int Equal;
    private String[] formats;

    public TimeUnit(int inSecond, String[] formats){
        InSecond = inSecond;
        this.formats = formats;
    }

    public int getSeconds(int seconds){
        Equal = seconds / InSecond;
        seconds -= Equal * InSecond;
        System.out.println(Equal);
        return seconds;
    }

    public String getString(){
        return Equal < 0 ? "" : (Equal) + " " + formatWord(Equal, formats[0], formats[1], formats[2]);
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
