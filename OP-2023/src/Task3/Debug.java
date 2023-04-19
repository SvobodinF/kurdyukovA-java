package Task3;
public class Debug {
    public static void invoke() {
        Triangle triangle = new Triangle(new Point(), new Point(), new Point());
        System.out.println("Барицентр треугольника находится в координатах [" + triangle.getXBarycenter() + "," + triangle.getYBarycenter() + "]");
    }
}