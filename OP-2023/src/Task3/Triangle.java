package Task3;

import java.util.Scanner;

public class Triangle {
    private Point A;
    private Point B;
    private Point C;
    public Triangle(Point A, Point B, Point C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }
    public float getXBarycenter() {
        return (A.x + B.x + C.x)/3;
    }
    public float getYBarycenter() {
        return (A.y + B.y + C.y)/3;
    }
}