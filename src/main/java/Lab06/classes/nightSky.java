package Lab06.classes;
import java.util.Random;

public class nightSky {
    int width, height;
    double density;

    public nightSky(double density) {
        this.density = density;
        this.width = 20;
        this.height = 10;
    }

    public nightSky(int width, int height) {
        this.width = width;
        this.height = height;
        this.density = 0.1;
    }

    public nightSky(int width, int height, double density) {
        this.width = width;
        this.height = height;
        this.density = density;
    }

    public static String printLine(int width) {
        Random random = new Random();
        for (int i = 0; i < width - 1; i++) {
            boolean printStar = random.nextBoolean();
            if(printStar) {
                System.out.print("* ");
            } else {
                System.out.print(" ");
            }

        }
        return " ";
    }

    public
}
