package CP3;

import Utils.Debuggable;

import java.util.ArrayList;
import java.util.Scanner;

public class Task17 implements Debuggable {

    public void invoke() {
        System.out.println("Введите строку скобок: ");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        System.out.println(valid(input));
    }

    private static String valid(String str){
        ArrayList<Character> list = new ArrayList<>();

        for (int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            if (ch != '(' && ch != ')'){
                return "Invalid operation";
            }

            if (ch == '('){
                list.add(ch);
            }

            if (ch == ')'){
                if (list.contains('(') == false){
                    return "False";
                }

                list.remove(list.size() - 1);
            }
        }

        return list.size() == 0 ? "True" : "False";
    }

}
