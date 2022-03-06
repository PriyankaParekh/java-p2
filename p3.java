import java.util.Random;

public class p3 {
    public static void main(String[] arg) {
        int person1, person2;
        Random rand = new Random();
        int point1 = 0, point2 = 0;
        System.out.println("     Person 1        Person 2");
        while ((point1 <= 30) && (point2 <= 30)) {
            person1 = rand.nextInt(6) + 1;
            person2 = rand.nextInt(6) + 1;
            System.out.printf("\t%d\t\t", person1);
            System.out.printf("%d\t\t", person2);

            System.out.println();

            point1 = point1 + person1;
            point2 = point2 + person2;
        }
        System.out.println("---------------------------------");
        System.out.printf("\t%d\t\t", point1);
        System.out.printf("%d\t\t", point2);
        System.out.println();
        System.out.println("---------------------------------");

        if (point1 >= 30) {
            System.out.println("Winner is Person 1");
        } else {
            System.out.println("Winner is Person 2");
        }
    }
}
