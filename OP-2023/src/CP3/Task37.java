package CP3;

import Utils.*;

import java.util.ArrayList;
import java.util.List;

public class Task37 implements Debuggable {
    @Override
    public void invoke() {
        int playerCount = 6;
        int number = 3;

        ArrayList<Integer> players = new ArrayList<>();
        for (int i = 0; i < playerCount; i++){
            players.add(i + 1);
        }

        while (players.size() > 1){
            number += 3;

            int value = Utils.arrayValidation(players.toArray(), number);
            System.out.println("Lose - " + players.get(value));
            players.remove(value);
        }

        System.out.println("Winner - " + players.get(0));
    }
}
