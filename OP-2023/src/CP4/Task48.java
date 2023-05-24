package CP4;

import Utils.Debuggable;

import java.util.ArrayList;
import java.util.List;

public class Task48 implements Debuggable {
    @Override
    public void invoke() {
        System.out.println("Ряд: " + uniqueRange(10));
    }

    private List<Integer> uniqueRange(int length){
        ArrayList<Integer> u = new ArrayList<>();
        u.add(1);
        int pt1 = 0;
        int pt2 = 0;

        for(int i = 1;i<=length;i++){
            int y = 2* u.get(pt1) + 1;
            int z = 3* u.get(pt2) + 1;
            u.add(Math.min(y, z));
            if(u.get(i) == y) pt1++;
            if(u.get(i) == z) pt2++;
        }

        return u;
    }
}
