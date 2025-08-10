package Day9;

public class spiral2D
 {
    public static void main(String[] args) {
        int[][] arr = {
            {1,  2,  3,  4},
            {5,  6,  7,  8},
            {9, 10, 11, 12},
            {13,14, 15, 16}
        };

        int s = 0;
        int e = arr.length;

        while (s < e) {

            // 1. Top row: Left to Right
            for (int j = s; j < e; j++) {
                System.out.print(arr[s][j] + "  ");
            }

            // 2. Right column: Top to Bottom
            for (int i = s + 1; i < e; i++) {
                System.out.print(arr[i][e - 1] + "  ");
            }

            // 3. Bottom row: Right to Left
            for (int j = e - 2; j >= s; j--) {
                System.out.print(arr[e - 1][j] + "  ");
            }

            // 4. Left column: Bottom to Top
            for (int i = e - 2; i > s; i--) {
                System.out.print(arr[i][s] + "  ");
            }

            s++;
            e--;
        }
    }
}
