package CP4;

import Utils.Debuggable;
import java.util.*;

public class Task45 implements Debuggable {
    @Override
    public void invoke() {
        System.out.println("Roman Numeral of Integer is:"
                + integerToRoman(3549));
    }

    static String integerToRoman(int num)
    {
        HashMap<Integer, Character> roman = new HashMap<>();
        roman.put(1, 'I');
        roman.put(5, 'V');
        roman.put(10, 'X');
        roman.put(50, 'L');
        roman.put(100, 'C');
        roman.put(500, 'D');
        roman.put(1000, 'M');
        roman.put(5000, 'G');
        roman.put(10000, 'H');

        String tmp = num + "";
        int numDigits = tmp.length();

        String res = "";
        for (int i = 0; i < numDigits; ++i) {
            char src = tmp.charAt(i); // orig
            int number = (src - '0'); // convert to integer
            int place = (numDigits - 1) - i;
            int absolute = (int)Math.pow(10, place);

            if (number == 9) {
                res += roman.get(absolute);
                res += roman.get(absolute * 10);
            }
            else if (number >= 5) {
                res += roman.get(absolute * 5);
                res += repeat(roman.get(absolute) + "", number - 5);
            }
            else if (number == 4) {
                res += roman.get(absolute);
                res += roman.get(absolute * 5);
            }
            else {
                res += repeat(roman.get(absolute) + "", number);
            }
        }
        return res;
    }

    static String repeat(String str, int n)
    {
        if(str == null || n <= 0)
            return "";
        else
        {
            n--;
            return str + repeat(str,n);
        }

    }
}
