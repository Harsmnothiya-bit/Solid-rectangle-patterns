import java.util.*;

public class PatternsPractice {

    public static void main(String[] args) {
        int m = 6;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
