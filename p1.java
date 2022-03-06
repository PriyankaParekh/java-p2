public class p1 {
    public static void main(String[] args) {
        int matrix[][] = new int[6][6];
        int i, j, count;

        System.out.println("---------------------------------");
        for (i = 0; i < 6; i++) {
            for (j = 0; j < 6; j++) {
                matrix[i][j] = (int) ((Math.random() * 10) % 2);
                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();

        }
        System.out.println("---------------------------------");

        for (i = 0; i < 6; i++) {
            count = 0;
            for (j = 0; j < 6; j++) {
                if (matrix[i][j] == 1) {
                    count++;
                }
            }
            if (count % 2 == 1) {
                System.out.println("Row - " + (i + 1) + " have ODD no of 1s");
            }
        }
        System.out.println("---------------------------------");

        for (i = 0; i < 6; i++) {
            count = 0;
            for (j = 0; j < 6; j++) {
                if (matrix[j][i] == 1) {
                    count++;
                }
            }
            if (count % 2 == 1) {
                System.out.println("column - " + (i + 1) + " have ODD no of 1s");
            }
        }
        System.out.println("---------------------------------");

    }
}
