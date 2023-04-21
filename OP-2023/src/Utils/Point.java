package Utils;
import java.util.Scanner;

public class Point{
    float x;
    float y;
    public Point(){
        Scanner scanner = new Scanner(System.in);

        int size = 2;
        float [] coordinate = new float [size];
        for (int i = 0; i < size; i++) {
            String axis = i == 0 ? "X" : "Y";
            System.out.println("Введите " + axis +":");
            coordinate[i] = scanner.nextInt();
        }
        this.x = coordinate[0];
        this.y = coordinate[1];
    }
}
