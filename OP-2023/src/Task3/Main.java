package Task3;
public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(new Point(), new Point(), new Point());
        System.out.println("Барицентр треугольника находится в координатах [" + triangle.getXBarycenter() + "," + triangle.getYBarycenter() + "]");
    }
}