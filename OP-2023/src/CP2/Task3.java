package CP2;

import Utils.*;

public class Task3 implements Debuggable {
    public void invoke() {
        Triangle triangle = new Triangle(new Point(), new Point(), new Point());
        System.out.println("Барицентр треугольника находится в координатах [" + triangle.getXBarycenter() + "," + triangle.getYBarycenter() + "]");
    }
}