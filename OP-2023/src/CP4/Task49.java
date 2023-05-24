package CP4;

import Utils.Debuggable;

public class Task49 implements Debuggable {
    @Override
    public void invoke() {
        System.out.println(fusc(0));
        System.out.println(fusc(1));
        System.out.println(fusc(4));
        System.out.println(fusc(5));
    }

    private int fusc(int n){
        if (n == 0 || n == 1) return n;
        if (n % 2 == 0) return fusc(n / 2);
        return fusc((n-1) / 2) + fusc((n+1) / 2);
    }
}
