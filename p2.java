import java.util.Random;

public class p2 {
    public static void main(String[] args) {
        Random num = new Random(1000);
        System.out.println("-------------------------------------------------------------------");
        for (int i = 0; i < 100; i++) {
            System.out.format("%3d", num.nextInt(49));
            if ((i + 1) % 20 == 0) {
                System.out.println();
            }
        }
        System.out.println("--------------------------------------------------------------------");

    }
}
