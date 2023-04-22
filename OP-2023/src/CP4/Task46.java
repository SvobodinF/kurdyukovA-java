package CP4;

import Utils.Debuggable;

public class Task46 implements Debuggable {
    @Override
    public void invoke() {
        String roman = "MMMDXLIX";
        System.out.println(romaToDecimal(roman));
    }

    private static int letterToNumber(char letter){
        switch (letter) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: throw new NumberFormatException("Invalid format");
        }
    }

    public static int romaToDecimal(String roman){
        if (roman.length() == 0)
            return 0;
        int integerValue = 0;
        int prevNumber = letterToNumber(roman.charAt(0));
        for (int i = 1; i < roman.length(); i++) {
            char ch = roman.charAt(i);
            int number = letterToNumber(ch);
            if (number <= prevNumber)
                integerValue += prevNumber;
            else
                integerValue -= prevNumber;
            prevNumber = number;
        }
        integerValue += prevNumber;
        return integerValue;
    }
}
