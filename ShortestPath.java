import java.util.Scanner;

public class ShortestPath {
    public static float pathDistance(String path) {
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {

            if (path.charAt(i) == 'N') {
                y++;
            } else if (path.charAt(i) == 'S') {
                y--;
            }

            else if (path.charAt(i) == 'E') {
                x++;
            }

            else if (path.charAt(i) == 'W') {
                x--;
            }

            else {
                System.out.println("CHECK THE STRING!!!");
                break;
            }
        }

        int X2 = x * x;
        int Y2 = y * y;
        float distance = (float) Math.sqrt(X2 + Y2);

        return distance;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String path = "WNEENESENNN";
        System.out.println(pathDistance(path));
    }
}
