package Day11;

public class seven {
    public static void main(String[] args) {
        String str = "WNEENESENNN";
        int x = 0, y = 0;
        int i = 0;

        while (i < str.length()) {
            char ch = str.charAt(i);
            if (ch == 'W') {
                x--;
            } else if (ch == 'N') {
                y++;
            } else if (ch == 'E') {
                x++;
            } else if (ch == 'S') {
                y--;
            }
            i++;
        }

        double ans = Math.sqrt((x * x) + (y * y));
        System.out.println("Shortest distance: " + ans);
    }
}
