package Day11;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        int min, max;
        int m = matrix.length;
        int n = matrix[0].length;
        
        List<Integer> list1 = new ArrayList<>(); // Row minima
        List<Integer> list2 = new ArrayList<>(); // Column maxima

        // Find min in each row
        for (int i = 0; i < m; i++) {
            min = matrix[i][0];
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
            list1.add(min);
        }

        // Find max in each column
        for (int j = 0; j < n; j++) {
            max = matrix[0][j];
            for (int i = 1; i < m; i++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
            list2.add(max);
        }

        // Intersection
        List<Integer> intersection = new ArrayList<>(list1);
        intersection.retainAll(list2);

        return intersection;
    }
}
