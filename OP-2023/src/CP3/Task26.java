package CP3;

import Utils.Debuggable;

import java.util.*;

public class Task26 implements Debuggable {
    public void invoke() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");
        String str = scanner.nextLine();

        System.out.println(func(str));
    }

    private String func(String str){
        List<String> palindromeList = new ArrayList<>();

        for (int charIdx = 0; charIdx < str.length() - 1; charIdx++) {

            int start = charIdx - 1;
            int end = charIdx + 1;

            while (end < str.length() && str.charAt(charIdx) == str.charAt(end)) {
                end++;
            }
            charIdx = end - 1;

            while (start >= 0 && end < str.length()) {
                if (str.charAt(start) == str.charAt(end)) {
                    start--;
                    end++;
                } else {
                    break;
                }
            }

            if (end - start >= 3) {
                palindromeList.add(str.substring(start + 1, end));
            }
        }

        String result = "";
        for (String palindrome : palindromeList) {
            if (result.length() <= palindrome.length()){
                result = palindrome;
            }
        }

        return result == "" ? "Нет палиндрома" : "Длиннейший палиндром - " + result + "\nДлина: " + result.length();
    }
}
