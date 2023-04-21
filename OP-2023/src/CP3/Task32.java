package CP3;

import Utils.Debuggable;
import Utils.Utils;

import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Task32 implements Debuggable {
    protected static final boolean playerTurn = true;
    @Override
    public void invoke() {
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        long stickCount = scanner.nextLong();

        BiFunction<Long, Integer, Long> minus = (x, y) -> x - y;
        Function<Long, Long> half = x -> x / 2;

        System.out.println(func(stickCount, minus, half));
    }

    private String func(long stickCount, BiFunction<Long, Integer, Long> rule1, Function<Long, Long> rule2){
        boolean player = getPLayer();
        System.out.println(player);
        while (stickCount > 1) {
            if (Utils.isEven(stickCount)) {
                stickCount = player ? stickCount = rule2.apply(stickCount) : rule1.apply(stickCount, 1);
            }
            else {
                stickCount = rule1.apply(stickCount, 1);
            }
            player = !player;
        }

        return player ? "Саша Win" : "Таня Win";
    }

    protected boolean getPLayer(){
        return playerTurn;
    }
}
